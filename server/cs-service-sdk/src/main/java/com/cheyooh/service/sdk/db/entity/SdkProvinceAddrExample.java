package com.cheyooh.service.sdk.db.entity;

import java.util.ArrayList;
import java.util.List;

public class SdkProvinceAddrExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sdk_province_addr
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sdk_province_addr
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sdk_province_addr
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_province_addr
     *
     * @mbggenerated
     */
    public SdkProvinceAddrExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_province_addr
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_province_addr
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_province_addr
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_province_addr
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_province_addr
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_province_addr
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_province_addr
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
     * This method corresponds to the database table sdk_province_addr
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
     * This method corresponds to the database table sdk_province_addr
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_province_addr
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
     * This class corresponds to the database table sdk_province_addr
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
          * 字段说明: 省份地址编码
        */
        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 省份地址编码
        */
        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 省份地址编码
        */
        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 省份地址编码
        */
        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 省份地址编码
        */
        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 省份地址编码
        */
        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 省份地址编码
        */
        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 省份地址编码
        */
        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 省份地址编码
        */
        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 省份地址编码
        */
        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProvincenmIsNull() {
            addCriterion("provincenm is null");
            return (Criteria) this;
        }

        public Criteria andProvincenmIsNotNull() {
            addCriterion("provincenm is not null");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 省份地址名称
        */
        public Criteria andProvincenmEqualTo(String value) {
            addCriterion("provincenm =", value, "provincenm");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 省份地址名称
        */
        public Criteria andProvincenmNotEqualTo(String value) {
            addCriterion("provincenm <>", value, "provincenm");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 省份地址名称
        */
        public Criteria andProvincenmGreaterThan(String value) {
            addCriterion("provincenm >", value, "provincenm");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 省份地址名称
        */
        public Criteria andProvincenmGreaterThanOrEqualTo(String value) {
            addCriterion("provincenm >=", value, "provincenm");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 省份地址名称
        */
        public Criteria andProvincenmLessThan(String value) {
            addCriterion("provincenm <", value, "provincenm");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 省份地址名称
        */
        public Criteria andProvincenmLessThanOrEqualTo(String value) {
            addCriterion("provincenm <=", value, "provincenm");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 省份地址名称
        */
        public Criteria andProvincenmLike(String value) {
            addCriterion("provincenm like", value, "provincenm");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 省份地址名称
        */
        public Criteria andProvincenmNotLike(String value) {
            addCriterion("provincenm not like", value, "provincenm");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 省份地址名称
        */
        public Criteria andProvincenmIn(List<String> values) {
            addCriterion("provincenm in", values, "provincenm");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 省份地址名称
        */
        public Criteria andProvincenmNotIn(List<String> values) {
            addCriterion("provincenm not in", values, "provincenm");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 省份地址名称
        */
        public Criteria andProvincenmBetween(String value1, String value2) {
            addCriterion("provincenm between", value1, value2, "provincenm");
            return (Criteria) this;
        }

        /**<br/>
          * 字段说明: 省份地址名称
        */
        public Criteria andProvincenmNotBetween(String value1, String value2) {
            addCriterion("provincenm not between", value1, value2, "provincenm");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sdk_province_addr
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
     * This class corresponds to the database table sdk_province_addr
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