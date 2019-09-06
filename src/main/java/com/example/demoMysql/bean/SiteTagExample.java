package com.example.demoMysql.bean;

import java.util.ArrayList;
import java.util.Date;
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

        public Criteria andSiteIdEqualTo(Integer value) {
            addCriterion("site_id =", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotEqualTo(Integer value) {
            addCriterion("site_id <>", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThan(Integer value) {
            addCriterion("site_id >", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("site_id >=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThan(Integer value) {
            addCriterion("site_id <", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThanOrEqualTo(Integer value) {
            addCriterion("site_id <=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdIn(List<Integer> values) {
            addCriterion("site_id in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotIn(List<Integer> values) {
            addCriterion("site_id not in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdBetween(Integer value1, Integer value2) {
            addCriterion("site_id between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andTagIdEqualTo(Long value) {
            addCriterion("tag_id =", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotEqualTo(Long value) {
            addCriterion("tag_id <>", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdGreaterThan(Long value) {
            addCriterion("tag_id >", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tag_id >=", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdLessThan(Long value) {
            addCriterion("tag_id <", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdLessThanOrEqualTo(Long value) {
            addCriterion("tag_id <=", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdIn(List<Long> values) {
            addCriterion("tag_id in", values, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotIn(List<Long> values) {
            addCriterion("tag_id not in", values, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdBetween(Long value1, Long value2) {
            addCriterion("tag_id between", value1, value2, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotBetween(Long value1, Long value2) {
            addCriterion("tag_id not between", value1, value2, "tagId");
            return (Criteria) this;
        }

        public Criteria andValExtraInfoIsNull() {
            addCriterion("val_extra_info is null");
            return (Criteria) this;
        }

        public Criteria andValExtraInfoIsNotNull() {
            addCriterion("val_extra_info is not null");
            return (Criteria) this;
        }

        public Criteria andValExtraInfoEqualTo(String value) {
            addCriterion("val_extra_info =", value, "valExtraInfo");
            return (Criteria) this;
        }

        public Criteria andValExtraInfoNotEqualTo(String value) {
            addCriterion("val_extra_info <>", value, "valExtraInfo");
            return (Criteria) this;
        }

        public Criteria andValExtraInfoGreaterThan(String value) {
            addCriterion("val_extra_info >", value, "valExtraInfo");
            return (Criteria) this;
        }

        public Criteria andValExtraInfoGreaterThanOrEqualTo(String value) {
            addCriterion("val_extra_info >=", value, "valExtraInfo");
            return (Criteria) this;
        }

        public Criteria andValExtraInfoLessThan(String value) {
            addCriterion("val_extra_info <", value, "valExtraInfo");
            return (Criteria) this;
        }

        public Criteria andValExtraInfoLessThanOrEqualTo(String value) {
            addCriterion("val_extra_info <=", value, "valExtraInfo");
            return (Criteria) this;
        }

        public Criteria andValExtraInfoLike(String value) {
            addCriterion("val_extra_info like", value, "valExtraInfo");
            return (Criteria) this;
        }

        public Criteria andValExtraInfoNotLike(String value) {
            addCriterion("val_extra_info not like", value, "valExtraInfo");
            return (Criteria) this;
        }

        public Criteria andValExtraInfoIn(List<String> values) {
            addCriterion("val_extra_info in", values, "valExtraInfo");
            return (Criteria) this;
        }

        public Criteria andValExtraInfoNotIn(List<String> values) {
            addCriterion("val_extra_info not in", values, "valExtraInfo");
            return (Criteria) this;
        }

        public Criteria andValExtraInfoBetween(String value1, String value2) {
            addCriterion("val_extra_info between", value1, value2, "valExtraInfo");
            return (Criteria) this;
        }

        public Criteria andValExtraInfoNotBetween(String value1, String value2) {
            addCriterion("val_extra_info not between", value1, value2, "valExtraInfo");
            return (Criteria) this;
        }

        public Criteria andTdwTableIsNull() {
            addCriterion("tdw_table is null");
            return (Criteria) this;
        }

        public Criteria andTdwTableIsNotNull() {
            addCriterion("tdw_table is not null");
            return (Criteria) this;
        }

        public Criteria andTdwTableEqualTo(String value) {
            addCriterion("tdw_table =", value, "tdwTable");
            return (Criteria) this;
        }

        public Criteria andTdwTableNotEqualTo(String value) {
            addCriterion("tdw_table <>", value, "tdwTable");
            return (Criteria) this;
        }

        public Criteria andTdwTableGreaterThan(String value) {
            addCriterion("tdw_table >", value, "tdwTable");
            return (Criteria) this;
        }

        public Criteria andTdwTableGreaterThanOrEqualTo(String value) {
            addCriterion("tdw_table >=", value, "tdwTable");
            return (Criteria) this;
        }

        public Criteria andTdwTableLessThan(String value) {
            addCriterion("tdw_table <", value, "tdwTable");
            return (Criteria) this;
        }

        public Criteria andTdwTableLessThanOrEqualTo(String value) {
            addCriterion("tdw_table <=", value, "tdwTable");
            return (Criteria) this;
        }

        public Criteria andTdwTableLike(String value) {
            addCriterion("tdw_table like", value, "tdwTable");
            return (Criteria) this;
        }

        public Criteria andTdwTableNotLike(String value) {
            addCriterion("tdw_table not like", value, "tdwTable");
            return (Criteria) this;
        }

        public Criteria andTdwTableIn(List<String> values) {
            addCriterion("tdw_table in", values, "tdwTable");
            return (Criteria) this;
        }

        public Criteria andTdwTableNotIn(List<String> values) {
            addCriterion("tdw_table not in", values, "tdwTable");
            return (Criteria) this;
        }

        public Criteria andTdwTableBetween(String value1, String value2) {
            addCriterion("tdw_table between", value1, value2, "tdwTable");
            return (Criteria) this;
        }

        public Criteria andTdwTableNotBetween(String value1, String value2) {
            addCriterion("tdw_table not between", value1, value2, "tdwTable");
            return (Criteria) this;
        }

        public Criteria andTdwFieldIsNull() {
            addCriterion("tdw_field is null");
            return (Criteria) this;
        }

        public Criteria andTdwFieldIsNotNull() {
            addCriterion("tdw_field is not null");
            return (Criteria) this;
        }

        public Criteria andTdwFieldEqualTo(String value) {
            addCriterion("tdw_field =", value, "tdwField");
            return (Criteria) this;
        }

        public Criteria andTdwFieldNotEqualTo(String value) {
            addCriterion("tdw_field <>", value, "tdwField");
            return (Criteria) this;
        }

        public Criteria andTdwFieldGreaterThan(String value) {
            addCriterion("tdw_field >", value, "tdwField");
            return (Criteria) this;
        }

        public Criteria andTdwFieldGreaterThanOrEqualTo(String value) {
            addCriterion("tdw_field >=", value, "tdwField");
            return (Criteria) this;
        }

        public Criteria andTdwFieldLessThan(String value) {
            addCriterion("tdw_field <", value, "tdwField");
            return (Criteria) this;
        }

        public Criteria andTdwFieldLessThanOrEqualTo(String value) {
            addCriterion("tdw_field <=", value, "tdwField");
            return (Criteria) this;
        }

        public Criteria andTdwFieldLike(String value) {
            addCriterion("tdw_field like", value, "tdwField");
            return (Criteria) this;
        }

        public Criteria andTdwFieldNotLike(String value) {
            addCriterion("tdw_field not like", value, "tdwField");
            return (Criteria) this;
        }

        public Criteria andTdwFieldIn(List<String> values) {
            addCriterion("tdw_field in", values, "tdwField");
            return (Criteria) this;
        }

        public Criteria andTdwFieldNotIn(List<String> values) {
            addCriterion("tdw_field not in", values, "tdwField");
            return (Criteria) this;
        }

        public Criteria andTdwFieldBetween(String value1, String value2) {
            addCriterion("tdw_field between", value1, value2, "tdwField");
            return (Criteria) this;
        }

        public Criteria andTdwFieldNotBetween(String value1, String value2) {
            addCriterion("tdw_field not between", value1, value2, "tdwField");
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

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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