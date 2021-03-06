package com.cheyooh.service.sdk.db.dao;

import com.cheyooh.service.sdk.db.entity.SdkGameEmbedsdk;
import com.cheyooh.service.sdk.db.entity.SdkGameEmbedsdkExample;
import com.cheyooh.tools.utils.Pagination;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SdkGameEmbedsdkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_game_embedsdk
     *
     * @mbggenerated
     */
    int countByExample(SdkGameEmbedsdkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_game_embedsdk
     *
     * @mbggenerated
     */
    int deleteByExample(SdkGameEmbedsdkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_game_embedsdk
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_game_embedsdk
     *
     * @mbggenerated
     */
    int insert(SdkGameEmbedsdk record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_game_embedsdk
     *
     * @mbggenerated
     */
    int insertSelective(SdkGameEmbedsdk record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_game_embedsdk
     *
     * @mbggenerated
     */
    List<SdkGameEmbedsdk> selectByExample(SdkGameEmbedsdkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_game_embedsdk
     *
     * @mbggenerated
     */
    Pagination<SdkGameEmbedsdk> selectByExample(SdkGameEmbedsdkExample example, RowBounds rowbounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_game_embedsdk
     *
     * @mbggenerated
     */
    SdkGameEmbedsdk selectOne(SdkGameEmbedsdkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_game_embedsdk
     *
     * @mbggenerated
     */
    SdkGameEmbedsdk selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_game_embedsdk
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SdkGameEmbedsdk record, @Param("example") SdkGameEmbedsdkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_game_embedsdk
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SdkGameEmbedsdk record, @Param("example") SdkGameEmbedsdkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_game_embedsdk
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SdkGameEmbedsdk record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_game_embedsdk
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SdkGameEmbedsdk record);
}