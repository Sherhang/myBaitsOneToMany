package com.example.demoMysql.bean;

import java.util.ArrayList;
import java.util.List;

public class SiteTagExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     *  构造查询条件,site_tag
     */
    public SiteTagExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,site_tag
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,site_tag
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,site_tag
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,site_tag
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,site_tag
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,site_tag
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,site_tag
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,site_tag
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,site_tag
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,site_tag
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 
     * GeneratedCriteria
     * 数据库表：site_tag
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

        public Criteria andSiteIdIsNull() {
            addCriterion("site_id is null");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNotNull() {
            addCriterion("site_id is not null");
            return (Criteria) this;
        }

        public Criteria andSiteIdEqualTo(Long value) {
            addCriterion("site_id =", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotEqualTo(Long value) {
            addCriterion("site_id <>", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThan(Long value) {
            addCriterion("site_id >", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThanOrEqualTo(Long value) {
            addCriterion("site_id >=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThan(Long value) {
            addCriterion("site_id <", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThanOrEqualTo(Long value) {
            addCriterion("site_id <=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdIn(List<Long> values) {
            addCriterion("site_id in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotIn(List<Long> values) {
            addCriterion("site_id not in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdBetween(Long value1, Long value2) {
            addCriterion("site_id between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotBetween(Long value1, Long value2) {
            addCriterion("site_id not between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andTagIdIsNull() {
            addCriterion("tag_id is null");
            return (Criteria) this;
        }

        public Criteria andTagIdIsNotNull() {
            addCriterion("tag_id is not null");
            return (Criteria) this;
        }

        public Criteria andTagIdEqualTo(Double value) {
            addCriterion("tag_id =", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotEqualTo(Double value) {
            addCriterion("tag_id <>", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdGreaterThan(Double value) {
            addCriterion("tag_id >", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdGreaterThanOrEqualTo(Double value) {
            addCriterion("tag_id >=", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdLessThan(Double value) {
            addCriterion("tag_id <", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdLessThanOrEqualTo(Double value) {
            addCriterion("tag_id <=", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdIn(List<Double> values) {
            addCriterion("tag_id in", values, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotIn(List<Double> values) {
            addCriterion("tag_id not in", values, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdBetween(Double value1, Double value2) {
            addCriterion("tag_id between", value1, value2, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotBetween(Double value1, Double value2) {
            addCriterion("tag_id not between", value1, value2, "tagId");
            return (Criteria) this;
        }

        public Criteria andTdwColumnIsNull() {
            addCriterion("tdw_column is null");
            return (Criteria) this;
        }

        public Criteria andTdwColumnIsNotNull() {
            addCriterion("tdw_column is not null");
            return (Criteria) this;
        }

        public Criteria andTdwColumnEqualTo(Double value) {
            addCriterion("tdw_column =", value, "tdwColumn");
            return (Criteria) this;
        }

        public Criteria andTdwColumnNotEqualTo(Double value) {
            addCriterion("tdw_column <>", value, "tdwColumn");
            return (Criteria) this;
        }

        public Criteria andTdwColumnGreaterThan(Double value) {
            addCriterion("tdw_column >", value, "tdwColumn");
            return (Criteria) this;
        }

        public Criteria andTdwColumnGreaterThanOrEqualTo(Double value) {
            addCriterion("tdw_column >=", value, "tdwColumn");
            return (Criteria) this;
        }

        public Criteria andTdwColumnLessThan(Double value) {
            addCriterion("tdw_column <", value, "tdwColumn");
            return (Criteria) this;
        }

        public Criteria andTdwColumnLessThanOrEqualTo(Double value) {
            addCriterion("tdw_column <=", value, "tdwColumn");
            return (Criteria) this;
        }

        public Criteria andTdwColumnIn(List<Double> values) {
            addCriterion("tdw_column in", values, "tdwColumn");
            return (Criteria) this;
        }

        public Criteria andTdwColumnNotIn(List<Double> values) {
            addCriterion("tdw_column not in", values, "tdwColumn");
            return (Criteria) this;
        }

        public Criteria andTdwColumnBetween(Double value1, Double value2) {
            addCriterion("tdw_column between", value1, value2, "tdwColumn");
            return (Criteria) this;
        }

        public Criteria andTdwColumnNotBetween(Double value1, Double value2) {
            addCriterion("tdw_column not between", value1, value2, "tdwColumn");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：site_tag
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * Criterion
     * 数据库表：site_tag
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