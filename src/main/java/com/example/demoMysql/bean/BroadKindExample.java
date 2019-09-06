package com.example.demoMysql.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BroadKindExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     *  构造查询条件,broad_kind
     */
    public BroadKindExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,broad_kind
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,broad_kind
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,broad_kind
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,broad_kind
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,broad_kind
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,broad_kind
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,broad_kind
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,broad_kind
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,broad_kind
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,broad_kind
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 大类表 
     * GeneratedCriteria
     * 数据库表：broad_kind
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

        public Criteria andBroadKindIdIsNull() {
            addCriterion("broad_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andBroadKindIdIsNotNull() {
            addCriterion("broad_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andBroadKindIdEqualTo(Integer value) {
            addCriterion("broad_kind_id =", value, "broadKindId");
            return (Criteria) this;
        }

        public Criteria andBroadKindIdNotEqualTo(Integer value) {
            addCriterion("broad_kind_id <>", value, "broadKindId");
            return (Criteria) this;
        }

        public Criteria andBroadKindIdGreaterThan(Integer value) {
            addCriterion("broad_kind_id >", value, "broadKindId");
            return (Criteria) this;
        }

        public Criteria andBroadKindIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("broad_kind_id >=", value, "broadKindId");
            return (Criteria) this;
        }

        public Criteria andBroadKindIdLessThan(Integer value) {
            addCriterion("broad_kind_id <", value, "broadKindId");
            return (Criteria) this;
        }

        public Criteria andBroadKindIdLessThanOrEqualTo(Integer value) {
            addCriterion("broad_kind_id <=", value, "broadKindId");
            return (Criteria) this;
        }

        public Criteria andBroadKindIdIn(List<Integer> values) {
            addCriterion("broad_kind_id in", values, "broadKindId");
            return (Criteria) this;
        }

        public Criteria andBroadKindIdNotIn(List<Integer> values) {
            addCriterion("broad_kind_id not in", values, "broadKindId");
            return (Criteria) this;
        }

        public Criteria andBroadKindIdBetween(Integer value1, Integer value2) {
            addCriterion("broad_kind_id between", value1, value2, "broadKindId");
            return (Criteria) this;
        }

        public Criteria andBroadKindIdNotBetween(Integer value1, Integer value2) {
            addCriterion("broad_kind_id not between", value1, value2, "broadKindId");
            return (Criteria) this;
        }

        public Criteria andKindIdIsNull() {
            addCriterion("kind_id is null");
            return (Criteria) this;
        }

        public Criteria andKindIdIsNotNull() {
            addCriterion("kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andKindIdEqualTo(Integer value) {
            addCriterion("kind_id =", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdNotEqualTo(Integer value) {
            addCriterion("kind_id <>", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdGreaterThan(Integer value) {
            addCriterion("kind_id >", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("kind_id >=", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdLessThan(Integer value) {
            addCriterion("kind_id <", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdLessThanOrEqualTo(Integer value) {
            addCriterion("kind_id <=", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdIn(List<Integer> values) {
            addCriterion("kind_id in", values, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdNotIn(List<Integer> values) {
            addCriterion("kind_id not in", values, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdBetween(Integer value1, Integer value2) {
            addCriterion("kind_id between", value1, value2, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdNotBetween(Integer value1, Integer value2) {
            addCriterion("kind_id not between", value1, value2, "kindId");
            return (Criteria) this;
        }

        public Criteria andBroadKindNameIsNull() {
            addCriterion("broad_kind_name is null");
            return (Criteria) this;
        }

        public Criteria andBroadKindNameIsNotNull() {
            addCriterion("broad_kind_name is not null");
            return (Criteria) this;
        }

        public Criteria andBroadKindNameEqualTo(String value) {
            addCriterion("broad_kind_name =", value, "broadKindName");
            return (Criteria) this;
        }

        public Criteria andBroadKindNameNotEqualTo(String value) {
            addCriterion("broad_kind_name <>", value, "broadKindName");
            return (Criteria) this;
        }

        public Criteria andBroadKindNameGreaterThan(String value) {
            addCriterion("broad_kind_name >", value, "broadKindName");
            return (Criteria) this;
        }

        public Criteria andBroadKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("broad_kind_name >=", value, "broadKindName");
            return (Criteria) this;
        }

        public Criteria andBroadKindNameLessThan(String value) {
            addCriterion("broad_kind_name <", value, "broadKindName");
            return (Criteria) this;
        }

        public Criteria andBroadKindNameLessThanOrEqualTo(String value) {
            addCriterion("broad_kind_name <=", value, "broadKindName");
            return (Criteria) this;
        }

        public Criteria andBroadKindNameLike(String value) {
            addCriterion("broad_kind_name like", value, "broadKindName");
            return (Criteria) this;
        }

        public Criteria andBroadKindNameNotLike(String value) {
            addCriterion("broad_kind_name not like", value, "broadKindName");
            return (Criteria) this;
        }

        public Criteria andBroadKindNameIn(List<String> values) {
            addCriterion("broad_kind_name in", values, "broadKindName");
            return (Criteria) this;
        }

        public Criteria andBroadKindNameNotIn(List<String> values) {
            addCriterion("broad_kind_name not in", values, "broadKindName");
            return (Criteria) this;
        }

        public Criteria andBroadKindNameBetween(String value1, String value2) {
            addCriterion("broad_kind_name between", value1, value2, "broadKindName");
            return (Criteria) this;
        }

        public Criteria andBroadKindNameNotBetween(String value1, String value2) {
            addCriterion("broad_kind_name not between", value1, value2, "broadKindName");
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
     * 数据库表：broad_kind
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 大类表 
     * Criterion
     * 数据库表：broad_kind
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