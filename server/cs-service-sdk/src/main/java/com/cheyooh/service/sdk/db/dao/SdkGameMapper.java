package com.cheyooh.service.sdk.db.dao;

import com.cheyooh.service.sdk.db.entity.SdkGame;
import com.cheyooh.service.sdk.db.entity.SdkGameExample;
import com.cheyooh.tools.utils.Pagination;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SdkGameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_game
     *
     * @mbggenerated
     */
    int countByExample(SdkGameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_game
     *
     * @mbggenerated
     */
    int deleteByExample(SdkGameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_game
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer gameId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_game
     *
     * @mbggenerated
     */
    int insert(SdkGame record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_game
     *
     * @mbggenerated
     */
    int insertSelective(SdkGame record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_game
     *
     * @mbggenerated
     */
    List<SdkGame> selectByExample(SdkGameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_game
     *
     * @mbggenerated
     */
    Pagination<SdkGame> selectByExample(SdkGameExample example, RowBounds rowbounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_game
     *
     * @mbggenerated
     */
    SdkGame selectOne(SdkGameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_game
     *
     * @mbggenerated
     */
    SdkGame selectByPrimaryKey(Integer gameId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_game
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SdkGame record, @Param("example") SdkGameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_game
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SdkGame record, @Param("example") SdkGameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_game
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SdkGame record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_game
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SdkGame record);
}