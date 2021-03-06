package com.cheyooh.service.sdk.action.client;

import java.io.ByteArrayInputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.nuxeo.common.xmap.XMap;

import com.cheyooh.service.dal.DAL;
import com.cheyooh.service.dal.DALFactory;
import com.cheyooh.service.framework.idata.Result;
import com.cheyooh.service.framework.idata.StatusCode;
import com.cheyooh.service.sdk.db.dao.SdkGameWechatMapper;
import com.cheyooh.service.sdk.db.dao.SdkOperatorPayTypeMapper;
import com.cheyooh.service.sdk.db.dao.SdkOrderMapper;
import com.cheyooh.service.sdk.db.dao.SdkOrderWechatMapper;
import com.cheyooh.service.sdk.db.entity.SdkGameWechat;
import com.cheyooh.service.sdk.db.entity.SdkGameWechatExample;
import com.cheyooh.service.sdk.db.entity.SdkOperatorPayType;
import com.cheyooh.service.sdk.db.entity.SdkOperatorPayTypeExample;
import com.cheyooh.service.sdk.db.entity.SdkOrder;
import com.cheyooh.service.sdk.db.entity.SdkOrderWechat;
import com.cheyooh.service.sdk.idata.CmdPay;
import com.cheyooh.service.sdk.idata.ResultPayWechatInfo;
import com.cheyooh.service.sdk.idata.gameserver.XmlWechatUnifiedorderReq;
import com.cheyooh.service.sdk.idata.gameserver.XmlWechatUnifiedorderResp;
import com.cheyooh.service.sdk.tools.GenerateTool;

/**
 * 
 * 微信支付
 * 
 * @author jiguang.liang@magicbirds.cn
 * 
 */
public class Pay_wechat extends AbstractSdkClientService<CmdPay> {
	private int paymentType=10;
	
	protected Result verify(CmdPay cmd) {
		// TODO :发布时修改为1f
		if (cmd.getAmount() < 0.000001f) {
			return StatusCode.ERR_PARAMETER().setMessage("无效的支付金额: " + cmd.getAmount());
		}
		DAL dal = DALFactory.createDAL();
		try {
			// 
			SdkOperatorPayTypeMapper sdkOperatorPayTypeMapper = dal.getMapper(SdkOperatorPayTypeMapper.class);
			SdkOperatorPayTypeExample sdkOperatorPayTypeExample = new SdkOperatorPayTypeExample();
			sdkOperatorPayTypeExample.createCriteria().andTypeEqualTo(paymentType).andVerLessThanOrEqualTo(cmd.getSdkver());
			List<SdkOperatorPayType> sdkOperatorPayTypeLists = sdkOperatorPayTypeMapper.selectByExample(sdkOperatorPayTypeExample);
			if(sdkOperatorPayTypeLists!=null && sdkOperatorPayTypeLists.size()>0){
				for (SdkOperatorPayType sdkOperatorPayType : sdkOperatorPayTypeLists) {
					if(sdkOperatorPayType.getMinPrice()<=cmd.getAmount() && sdkOperatorPayType.getMaxPrice()>=cmd.getAmount()){
						return super.verify(cmd);
					}
				}
			}
		}catch(Exception e){
			logger.error("the Pay_wechat appear exception :"+e);
		}finally {
			dal.close();
		}
		// 匹配不到相关计费金额
		return StatusCode.ERR_PARAMETER().setMessage("不支持此计费金额" + cmd.getAmount());
	}
 
	@Override
	protected boolean isLoginRequired() {
		return true;
	}

	@Override
	protected Result execute(CmdPay cmd) {
		Result result=null;
		DAL dal = DALFactory.createDAL();
		SdkOrderMapper sdkOrderMapper = dal.getMapper(SdkOrderMapper.class);
		SdkOrder sdkOrder=createOrder(cmd,paymentType);
		
		String appid="";
		String partnerid="";
		String prepayid="";
		String extra="Sign=WXPay";
		String noncestr="";
		String timestamp="";
		String sign="";
		String orderNo="";
		
		String appkey="";
		String mch_id="";
		String nonce_str="";
		String notify_url="";
		String ip = cmd.getRequestHost();
		try {
			sdkOrder.setStatus(2);
			orderNo=sdkOrder.getOrderNo();
			HttpServletRequest httpServletRequest = cmd.getServiceContext().getRequest();
			String sdkver_Param = httpServletRequest.getParameter("sdkver");
			sdkOrder.setSdkver(sdkver_Param);
			
			SdkGameWechatMapper sdkGameWechatMapper=dal.getMapper(SdkGameWechatMapper.class);
			SdkGameWechatExample sdkGameWechatExample=new SdkGameWechatExample();
			sdkGameWechatExample.createCriteria().andGameIdEqualTo(game.getGameId());
			SdkGameWechat sdkGameWechat=sdkGameWechatMapper.selectOne(sdkGameWechatExample);
			if(sdkGameWechat!=null){
				appid=sdkGameWechat.getAppid();
				mch_id=sdkGameWechat.getMchId();
				notify_url=sdkGameWechat.getNotifyUrl();
				appkey=sdkGameWechat.getKey();
				partnerid=mch_id;
			}else{
				return StatusCode.ERR_SYSTEM().setMessage("游戏没配置微信支付");
			}
			
			//参与签名的参数
			Map<String,String> map=new HashMap<>();
			map.put("appid", appid);
			map.put("mch_id", mch_id);
			nonce_str=getRandomString(16);
			map.put("nonce_str", nonce_str);
			map.put("body", sdkOrder.getOrderName());
			map.put("detail", sdkOrder.getOrderName());
			map.put("out_trade_no", sdkOrder.getOrderNo());
			float total_fee_float=sdkOrder.getAmount();
			int total_fee_int=(int)(total_fee_float*100);
			String total_fee_string=String.valueOf(total_fee_int);
			map.put("total_fee", total_fee_string);
			map.put("spbill_create_ip", ip);
			map.put("notify_url", notify_url);
			map.put("trade_type", "APP");
			sign=getSign(map,appkey);
			
			SdkOrderWechatMapper sdkOrderWechatMapper=dal.getMapper(SdkOrderWechatMapper.class);
			SdkOrderWechat sdkOrderWechat=new SdkOrderWechat();
			Date create_time=new Date();
			sdkOrderWechat.setReqTime(create_time);
			sdkOrderWechat.setAppid(appid);
			sdkOrderWechat.setMchId(mch_id);
			nonce_str=getRandomString(16);
			sdkOrderWechat.setNonceStr(nonce_str);
			sdkOrderWechat.setSign(sign);
			sdkOrderWechat.setBody(sdkOrder.getOrderName());
			sdkOrderWechat.setDetail(sdkOrder.getOrderName());
			sdkOrderWechat.setOutTradeNo(sdkOrder.getOrderNo());
			sdkOrderWechat.setTotalFee(total_fee_int);
			sdkOrderWechat.setSpbillCreateIp(ip);
			sdkOrderWechat.setNotifyUrl(notify_url);
			sdkOrderWechat.setTradeType("APP");
			
			sdkOrderWechatMapper.insertSelective(sdkOrderWechat);
			sdkOrder.setPayId(sdkOrderWechat.getPayId());
			sdkOrderMapper.insert(sdkOrder);
			
			Map<String,String> mapPostUnifiedorder=new HashMap<>();
			mapPostUnifiedorder.putAll(map);
			mapPostUnifiedorder.put("sign",sign);
			XmlWechatUnifiedorderResp xmlWechatUnifiedorderResp=post_unifiedorder(mapPostUnifiedorder);
			if("SUCCESS".equals(xmlWechatUnifiedorderResp.getReturn_code())){
				appid=xmlWechatUnifiedorderResp.getAppid();
				mch_id=xmlWechatUnifiedorderResp.getMch_id();
				prepayid=xmlWechatUnifiedorderResp.getPrepay_id();
				noncestr=xmlWechatUnifiedorderResp.getNonce_str();
				sign=xmlWechatUnifiedorderResp.getSign();
				long time=System.currentTimeMillis();
				int time_int=(int)(time/100);
				timestamp=String.valueOf(time_int);
				
				//获取到prepay_id后将参数再次签名
				Map<String,String> againSignMap=new HashMap<>();
				againSignMap.put("appid", appid);
				againSignMap.put("noncestr", noncestr);
				againSignMap.put("package", extra);
				againSignMap.put("partnerid", mch_id);
				againSignMap.put("timestamp", timestamp);
				againSignMap.put("prepayid", prepayid);
				String againGetSign=getSign(againSignMap,appkey);
				
				result=new Result(new ResultPayWechatInfo(appid,partnerid,prepayid,extra,noncestr,timestamp,againGetSign,orderNo));
			}else{
				logger.info("the pay_wechat req_fail, the orderno ="+sdkOrder.getOrderNo());
				sdkOrder.setStatus(3);
				result=StatusCode.ERR_SYSTEM().setMessage("订单处理失败,请稍候再试!");
			}
			dal.commit();
		} catch (Exception e) {
			logger.error("the pay_wechat exception ="+e);
			sdkOrder.setStatus(4);
			dal.commit();
			result=StatusCode.ERR_SYSTEM().setMessage("订单处理异常,请稍候再试!");
		}finally {
			dal.close();
		}
		
		logger.debug("the Pay_wechat result is :"
				+ result.getXml("Pay_wechat"));
		return result;
	}

	/**
	 * 
	 * @param map里面的参数不为空
	 * @return
	 */
	private String getSign(Map<String, String> map,String appkey) {
		String result="";
		SortedMap<String,String> sortWithAscMap=new TreeMap<String, String>();
		sortWithAscMap.putAll(map);
		try{
			StringBuffer stringBuffer = new StringBuffer();
			int i=0;
			for(String key : sortWithAscMap.keySet()){
				if(i!=0){
					stringBuffer.append("&");
				}
				stringBuffer.append(key).append("=").append(sortWithAscMap.get(key));
				i++;
			}
			String stringA=stringBuffer.toString();
			String stringSignTemp=stringA+"&key="+appkey;
			result=DigestUtils.md5Hex(stringSignTemp).toUpperCase();
		}catch (Exception e) {
			logger.error("the pay_wechat getSign error ="+e);
			return null;
		}
		return result;
	}

	/**
	 * 生成指定长度的随机字符串
	 * @param length表示生成字符串的长度
	 * @return
	 */
	public static String getRandomString(int length) {
	    String base = "abcdefghijklmnopqrstuvwxyz0123456789";  
	    Random random = new Random();  
	    StringBuffer sb = new StringBuffer();  
	    for (int i = 0; i < length; i++) {  
	        int number = random.nextInt(base.length());  
	        sb.append(base.charAt(number));  
	    }  
	    return sb.toString();  
	 }  
	
	/**
	 * 调用统一订单接口
	 * @param map传进来的参数不为空
	 * @return
	 */
	private XmlWechatUnifiedorderResp post_unifiedorder(Map<String, String> map){
		HttpClient httpclient = new DefaultHttpClient();
		XmlWechatUnifiedorderResp xmlWechatUnifiedorderResp=new XmlWechatUnifiedorderResp();
		try {
			String sendUrl = "https://api.mch.weixin.qq.com/pay/unifiedorder";
			logger.debug("the pay_wechat send api = " + sendUrl);
			HttpPost post = new HttpPost(sendUrl);
			XmlWechatUnifiedorderReq xmlWechatUnifiedorderReq=new XmlWechatUnifiedorderReq();
			xmlWechatUnifiedorderReq.setAppid(map.get("appid"));
			xmlWechatUnifiedorderReq.setMch_id(map.get("mch_id"));
			xmlWechatUnifiedorderReq.setNonce_str(map.get("nonce_str"));
			xmlWechatUnifiedorderReq.setSign(map.get("sign"));
			xmlWechatUnifiedorderReq.setBody(map.get("body"));
			xmlWechatUnifiedorderReq.setDetail(map.get("detail"));
			xmlWechatUnifiedorderReq.setOut_trade_no(map.get("out_trade_no"));
			xmlWechatUnifiedorderReq.setTotal_fee(map.get("total_fee"));
			xmlWechatUnifiedorderReq.setSpbill_create_ip(map.get("spbill_create_ip"));
			xmlWechatUnifiedorderReq.setNotify_url(map.get("notify_url"));
			xmlWechatUnifiedorderReq.setTrade_type(map.get("trade_type"));
			String xmlBody =xmlWechatUnifiedorderReq.toXml();
			logger.debug("the pay_wechat send xmlBody = " + xmlBody);
			post.setEntity(new ByteArrayEntity(xmlBody.getBytes()));
			HttpResponse response = httpclient.execute(post);
			HttpEntity entity = response.getEntity();
			String content = EntityUtils.toString(entity, "UTF-8");
//			logger.debug("the pay_wechat response content ="+content);
			XMap xmap = new XMap();
			xmap.register(XmlWechatUnifiedorderResp.class);
			ByteArrayInputStream in = new ByteArrayInputStream(
					content.getBytes("utf-8"));
			xmlWechatUnifiedorderResp = (XmlWechatUnifiedorderResp) xmap.load(in);
			logger.debug("the pay_wechat xmlWechatUnifiedorderResp ="
					+ xmlWechatUnifiedorderResp.toString());
		} catch (Exception e) {
			logger.error("the pay_wechat request error =" + e, e);
			return null;
		} finally {
			httpclient.getConnectionManager().shutdown();
		}
		return xmlWechatUnifiedorderResp;
	}
	
	public static void main(String[] args) {
//		System.out.println(getRandomString(16));
		Pay_wechat pay_wechat=new Pay_wechat();
		//参与签名的参数
		Map<String,String> map=new HashMap<>();
		map.put("appid", "wxd9c0c13bacc6d9b0");
		map.put("mch_id", "1301475301");
		String nonce_str=getRandomString(16);
		map.put("nonce_str", nonce_str);
		map.put("body", "内测游戏");
		map.put("detail", "内测游戏");
		String order_no=GenerateTool.createOrderNo();
		map.put("out_trade_no", order_no);
		float total_fee_float=0.01f;
		int total_fee_int=(int)(total_fee_float*100);
		String total_fee_string=String.valueOf(total_fee_int);
		map.put("total_fee", total_fee_string);
		map.put("spbill_create_ip", "58.62.109.58");
		map.put("notify_url", "http://leyo.magicbirds.cn/notify/m/BaiduQmxdgNotify");
		map.put("trade_type", "APP");
		String sign=pay_wechat.getSign(map,"7ea0ec5ad7087525caa841b9aeee9c66");
		map.put("sign", sign);
		XmlWechatUnifiedorderResp xmlWechatUnifiedorderResp=pay_wechat.post_unifiedorder(map);
		System.out.println(xmlWechatUnifiedorderResp.toString());
		long time=System.currentTimeMillis();
		int time_int=(int)(time/100);
		System.out.println(time_int);
	}
}
