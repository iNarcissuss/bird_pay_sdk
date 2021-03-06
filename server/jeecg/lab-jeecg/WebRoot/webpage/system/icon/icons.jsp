<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>图标信息</title>
  <t:base type="jquery,easyui,tools"></t:base>
 </head>
   <script type="text/javascript">

  	function uploadFile(data){
  		if($(".uploadify-queue-item").length>0){
  			upload();
  		}else{
  	  		if($("#id").val()!=""){
  	  	      var id = $("#id").val();
  	  	      var iconName = $("#iconName").val();
  	  	 	  var iconType = $("#iconType").val();
  	  	 	  var url = encodeURI("iconController.do?update&id="+id+"&iconName="+iconName+"&iconType="+iconType);
  	  	 	  submitForm(url);
  	  		}else{
			frameElement.api.opener.reloadTable();
			frameElement.api.close();
  	  		}
  		}
  	}
  	
  	function close(){
  		frameElement.api.close();
  	}
  	function submitForm(url){
	  	$.ajax({
			async : false,
			cache : false,
			type : 'POST',
			url : url,// 请求的action路径
			error : function() {// 请求失败处理函数
			},
			success : function(data) {
				var d = $.parseJSON(data);
				if (d.success) {
					var msg = d.msg;
					frameElement.api.opener.tip(msg);
					frameElement.api.opener.reloadTable();
					frameElement.api.close();
				}
			}
		});
  	}

  	
  </script>
 <body style="overflow-y: hidden" scroll="no">
  <t:formvalid formid="formobj" layout="div" dialog="true" callback="@Override uploadFile" action="iconController.do?update">
   <input name="id" id="id" type="hidden" value="${icon.id}">
   <fieldset class="step">
    <div class="form">
      <label class="Validform_label">
      图标名称:
     </label>
     <input name="iconName" datatype="s2-10" id="iconName" value="${icon.iconName}" class="inputxt" >
      <span class="Validform_checktip">名称范围2~10位字符,且不为空</span>
    </div>
    <div class="form">
       <label class="Validform_label" >
      图标类型:
     </label>
     <select name="iconType" id="iconType">
      <option value="1"  <c:if test="${icon.iconType=='1'}">selected="selected"</c:if>>
       系统图标
      </option>
      <option value="2" <c:if test="${icon.iconType=='2'}">selected="selected"</c:if>>
       菜单图标
      </option>
     </select>
    </div>
      <div class="form" id="filediv">
    </div>
    <div class="form">
     <t:upload name="file_upload" uploader="iconController.do?saveOrUpdateIcon" extend="*.png;" id="file_upload" formData="id,iconName,iconType"></t:upload>
    </div>
   </fieldset>
  </t:formvalid>
 </body>
</html>
