package com.cheyooh.service.sdk.db.dao;

import com.cheyooh.service.sdk.db.entity.SdkNotifyWimi;
import com.cheyooh.service.sdk.db.entity.SdkNotifyWimiExample;
import com.cheyooh.tools.utils.Pagination;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SdkNotifyWimiMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_notify_wimi
     *
     * @mbggenerated
     */
    int countByExample(SdkNotifyWimiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_notify_wimi
     *
     * @mbggenerated
     */
    int deleteByExample(SdkNotifyWimiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_notify_wimi
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_notify_wimi
     *
     * @mbggenerated
     */
    int insert(SdkNotifyWimi record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_notify_wimi
     *
     * @mbggenerated
     */
    int insertSelective(SdkNotifyWimi record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_notify_wimi
     *
     * @mbggenerated
     */
    List<SdkNotifyWimi> selectByExample(SdkNotifyWimiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_notify_wimi
     *
     * @mbggenerated
     */
    Pagination<SdkNotifyWimi> selectByExample(SdkNotifyWimiExample example, RowBounds rowbounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_notify_wimi
     *
     * @mbggenerated
     */
    SdkNotifyWimi selectOne(SdkNotifyWimiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_notify_wimi
     *
     * @mbggenerated
     */
    SdkNotifyWimi selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_notify_wimi
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SdkNotifyWimi record, @Param("example") SdkNotifyWimiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_notify_wimi
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SdkNotifyWimi record, @Param("example") SdkNotifyWimiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_notify_wimi
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SdkNotifyWimi record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_notify_wimi
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SdkNotifyWimi record);
}