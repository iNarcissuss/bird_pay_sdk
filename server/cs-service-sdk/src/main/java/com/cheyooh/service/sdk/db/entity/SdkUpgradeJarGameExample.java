package com.cheyooh.service.sdk.db.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SdkUpgradeJarGameExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sdk_upgrade_jar_game
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sdk_upgrade_jar_game
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sdk_upgrade_jar_game
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_upgrade_jar_game
     *
     * @mbggenerated
     */
    public SdkUpgradeJarGameExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_upgrade_jar_game
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_upgrade_jar_game
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_upgrade_jar_game
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_upgrade_jar_game
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_upgrade_jar_game
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_upgrade_jar_game
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_upgrade_jar_game
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_upgrade_jar_game
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_upgrade_jar_game
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_upgrade_jar_game
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sdk_upgrade_jar_game
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 自增主键
        */
        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 自增主键
        */
        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 自增主键
        */
        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 自增主键
        */
        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 自增主键
        */
        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 自增主键
        */
        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 自增主键
        */
        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 自增主键
        */
        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 自增主键
        */
        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 自增主键
        */
        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andVersionCodeIsNull() {
            addCriterion("version_code is null");
            return (Criteria) this;
        }

        public Criteria andVersionCodeIsNotNull() {
            addCriterion("version_code is not null");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 版本号(判断版本新旧的依据)
        */
        public Criteria andVersionCodeEqualTo(String value) {
            addCriterion("version_code =", value, "versionCode");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 版本号(判断版本新旧的依据)
        */
        public Criteria andVersionCodeNotEqualTo(String value) {
            addCriterion("version_code <>", value, "versionCode");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 版本号(判断版本新旧的依据)
        */
        public Criteria andVersionCodeGreaterThan(String value) {
            addCriterion("version_code >", value, "versionCode");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 版本号(判断版本新旧的依据)
        */
        public Criteria andVersionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("version_code >=", value, "versionCode");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 版本号(判断版本新旧的依据)
        */
        public Criteria andVersionCodeLessThan(String value) {
            addCriterion("version_code <", value, "versionCode");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 版本号(判断版本新旧的依据)
        */
        public Criteria andVersionCodeLessThanOrEqualTo(String value) {
            addCriterion("version_code <=", value, "versionCode");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 版本号(判断版本新旧的依据)
        */
        public Criteria andVersionCodeLike(String value) {
            addCriterion("version_code like", value, "versionCode");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 版本号(判断版本新旧的依据)
        */
        public Criteria andVersionCodeNotLike(String value) {
            addCriterion("version_code not like", value, "versionCode");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 版本号(判断版本新旧的依据)
        */
        public Criteria andVersionCodeIn(List<String> values) {
            addCriterion("version_code in", values, "versionCode");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 版本号(判断版本新旧的依据)
        */
        public Criteria andVersionCodeNotIn(List<String> values) {
            addCriterion("version_code not in", values, "versionCode");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 版本号(判断版本新旧的依据)
        */
        public Criteria andVersionCodeBetween(String value1, String value2) {
            addCriterion("version_code between", value1, value2, "versionCode");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 版本号(判断版本新旧的依据)
        */
        public Criteria andVersionCodeNotBetween(String value1, String value2) {
            addCriterion("version_code not between", value1, value2, "versionCode");
            return (Criteria) this;
        }

        public Criteria andGameIdIsNull() {
            addCriterion("game_id is null");
            return (Criteria) this;
        }

        public Criteria andGameIdIsNotNull() {
            addCriterion("game_id is not null");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 游戏ID
        */
        public Criteria andGameIdEqualTo(Integer value) {
            addCriterion("game_id =", value, "gameId");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 游戏ID
        */
        public Criteria andGameIdNotEqualTo(Integer value) {
            addCriterion("game_id <>", value, "gameId");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 游戏ID
        */
        public Criteria andGameIdGreaterThan(Integer value) {
            addCriterion("game_id >", value, "gameId");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 游戏ID
        */
        public Criteria andGameIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("game_id >=", value, "gameId");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 游戏ID
        */
        public Criteria andGameIdLessThan(Integer value) {
            addCriterion("game_id <", value, "gameId");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 游戏ID
        */
        public Criteria andGameIdLessThanOrEqualTo(Integer value) {
            addCriterion("game_id <=", value, "gameId");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 游戏ID
        */
        public Criteria andGameIdIn(List<Integer> values) {
            addCriterion("game_id in", values, "gameId");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 游戏ID
        */
        public Criteria andGameIdNotIn(List<Integer> values) {
            addCriterion("game_id not in", values, "gameId");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 游戏ID
        */
        public Criteria andGameIdBetween(Integer value1, Integer value2) {
            addCriterion("game_id between", value1, value2, "gameId");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 游戏ID
        */
        public Criteria andGameIdNotBetween(Integer value1, Integer value2) {
            addCriterion("game_id not between", value1, value2, "gameId");
            return (Criteria) this;
        }

        public Criteria andStatusTagIsNull() {
            addCriterion("status_tag is null");
            return (Criteria) this;
        }

        public Criteria andStatusTagIsNotNull() {
            addCriterion("status_tag is not null");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 状态(0-禁用, 1-启用)
        */
        public Criteria andStatusTagEqualTo(Integer value) {
            addCriterion("status_tag =", value, "statusTag");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 状态(0-禁用, 1-启用)
        */
        public Criteria andStatusTagNotEqualTo(Integer value) {
            addCriterion("status_tag <>", value, "statusTag");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 状态(0-禁用, 1-启用)
        */
        public Criteria andStatusTagGreaterThan(Integer value) {
            addCriterion("status_tag >", value, "statusTag");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 状态(0-禁用, 1-启用)
        */
        public Criteria andStatusTagGreaterThanOrEqualTo(Integer value) {
            addCriterion("status_tag >=", value, "statusTag");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 状态(0-禁用, 1-启用)
        */
        public Criteria andStatusTagLessThan(Integer value) {
            addCriterion("status_tag <", value, "statusTag");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 状态(0-禁用, 1-启用)
        */
        public Criteria andStatusTagLessThanOrEqualTo(Integer value) {
            addCriterion("status_tag <=", value, "statusTag");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 状态(0-禁用, 1-启用)
        */
        public Criteria andStatusTagIn(List<Integer> values) {
            addCriterion("status_tag in", values, "statusTag");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 状态(0-禁用, 1-启用)
        */
        public Criteria andStatusTagNotIn(List<Integer> values) {
            addCriterion("status_tag not in", values, "statusTag");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 状态(0-禁用, 1-启用)
        */
        public Criteria andStatusTagBetween(Integer value1, Integer value2) {
            addCriterion("status_tag between", value1, value2, "statusTag");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 状态(0-禁用, 1-启用)
        */
        public Criteria andStatusTagNotBetween(Integer value1, Integer value2) {
            addCriterion("status_tag not between", value1, value2, "statusTag");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 增加时间
        */
        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 增加时间
        */
        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 增加时间
        */
        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 增加时间
        */
        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 增加时间
        */
        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 增加时间
        */
        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 增加时间
        */
        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 增加时间
        */
        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 增加时间
        */
        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 增加时间
        */
        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("updated_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("updated_time is not null");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 更改时间
        */
        public Criteria andUpdatedTimeEqualTo(Date value) {
            addCriterion("updated_time =", value, "updatedTime");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 更改时间
        */
        public Criteria andUpdatedTimeNotEqualTo(Date value) {
            addCriterion("updated_time <>", value, "updatedTime");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 更改时间
        */
        public Criteria andUpdatedTimeGreaterThan(Date value) {
            addCriterion("updated_time >", value, "updatedTime");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 更改时间
        */
        public Criteria andUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_time >=", value, "updatedTime");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 更改时间
        */
        public Criteria andUpdatedTimeLessThan(Date value) {
            addCriterion("updated_time <", value, "updatedTime");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 更改时间
        */
        public Criteria andUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("updated_time <=", value, "updatedTime");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 更改时间
        */
        public Criteria andUpdatedTimeIn(List<Date> values) {
            addCriterion("updated_time in", values, "updatedTime");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 更改时间
        */
        public Criteria andUpdatedTimeNotIn(List<Date> values) {
            addCriterion("updated_time not in", values, "updatedTime");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 更改时间
        */
        public Criteria andUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("updated_time between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 更改时间
        */
        public Criteria andUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("updated_time not between", value1, value2, "updatedTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sdk_upgrade_jar_game
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sdk_upgrade_jar_game
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        public Criterion() {
            super();
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}