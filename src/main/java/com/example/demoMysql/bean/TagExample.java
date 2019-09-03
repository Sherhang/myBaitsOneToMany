package com.example.demoMysql.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TagExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     *  构造查询条件,tag
     */
    public TagExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,tag
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,tag
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,tag
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,tag
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,tag
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,tag
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,tag
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,tag
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,tag
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,tag
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 标签表 
     * GeneratedCriteria
     * 数据库表：tag
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTagNameIsNull() {
            addCriterion("tag_name is null");
            return (Criteria) this;
        }

        public Criteria andTagNameIsNotNull() {
            addCriterion("tag_name is not null");
            return (Criteria) this;
        }

        public Criteria andTagNameEqualTo(String value) {
            addCriterion("tag_name =", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameNotEqualTo(String value) {
            addCriterion("tag_name <>", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameGreaterThan(String value) {
            addCriterion("tag_name >", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameGreaterThanOrEqualTo(String value) {
            addCriterion("tag_name >=", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameLessThan(String value) {
            addCriterion("tag_name <", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameLessThanOrEqualTo(String value) {
            addCriterion("tag_name <=", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameLike(String value) {
            addCriterion("tag_name like", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameNotLike(String value) {
            addCriterion("tag_name not like", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameIn(List<String> values) {
            addCriterion("tag_name in", values, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameNotIn(List<String> values) {
            addCriterion("tag_name not in", values, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameBetween(String value1, String value2) {
            addCriterion("tag_name between", value1, value2, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameNotBetween(String value1, String value2) {
            addCriterion("tag_name not between", value1, value2, "tagName");
            return (Criteria) this;
        }

        public Criteria andChildKindIdIsNull() {
            addCriterion("child_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andChildKindIdIsNotNull() {
            addCriterion("child_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andChildKindIdEqualTo(Integer value) {
            addCriterion("child_kind_id =", value, "childKindId");
            return (Criteria) this;
        }

        public Criteria andChildKindIdNotEqualTo(Integer value) {
            addCriterion("child_kind_id <>", value, "childKindId");
            return (Criteria) this;
        }

        public Criteria andChildKindIdGreaterThan(Integer value) {
            addCriterion("child_kind_id >", value, "childKindId");
            return (Criteria) this;
        }

        public Criteria andChildKindIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("child_kind_id >=", value, "childKindId");
            return (Criteria) this;
        }

        public Criteria andChildKindIdLessThan(Integer value) {
            addCriterion("child_kind_id <", value, "childKindId");
            return (Criteria) this;
        }

        public Criteria andChildKindIdLessThanOrEqualTo(Integer value) {
            addCriterion("child_kind_id <=", value, "childKindId");
            return (Criteria) this;
        }

        public Criteria andChildKindIdIn(List<Integer> values) {
            addCriterion("child_kind_id in", values, "childKindId");
            return (Criteria) this;
        }

        public Criteria andChildKindIdNotIn(List<Integer> values) {
            addCriterion("child_kind_id not in", values, "childKindId");
            return (Criteria) this;
        }

        public Criteria andChildKindIdBetween(Integer value1, Integer value2) {
            addCriterion("child_kind_id between", value1, value2, "childKindId");
            return (Criteria) this;
        }

        public Criteria andChildKindIdNotBetween(Integer value1, Integer value2) {
            addCriterion("child_kind_id not between", value1, value2, "childKindId");
            return (Criteria) this;
        }

        public Criteria andDetailIdIsNull() {
            addCriterion("detail_id is null");
            return (Criteria) this;
        }

        public Criteria andDetailIdIsNotNull() {
            addCriterion("detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andDetailIdEqualTo(Integer value) {
            addCriterion("detail_id =", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotEqualTo(Integer value) {
            addCriterion("detail_id <>", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThan(Integer value) {
            addCriterion("detail_id >", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("detail_id >=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThan(Integer value) {
            addCriterion("detail_id <", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("detail_id <=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdIn(List<Integer> values) {
            addCriterion("detail_id in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotIn(List<Integer> values) {
            addCriterion("detail_id not in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("detail_id between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("detail_id not between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andColumnTypeIsNull() {
            addCriterion("column_type is null");
            return (Criteria) this;
        }

        public Criteria andColumnTypeIsNotNull() {
            addCriterion("column_type is not null");
            return (Criteria) this;
        }

        public Criteria andColumnTypeEqualTo(Integer value) {
            addCriterion("column_type =", value, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeNotEqualTo(Integer value) {
            addCriterion("column_type <>", value, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeGreaterThan(Integer value) {
            addCriterion("column_type >", value, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("column_type >=", value, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeLessThan(Integer value) {
            addCriterion("column_type <", value, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeLessThanOrEqualTo(Integer value) {
            addCriterion("column_type <=", value, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeIn(List<Integer> values) {
            addCriterion("column_type in", values, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeNotIn(List<Integer> values) {
            addCriterion("column_type not in", values, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeBetween(Integer value1, Integer value2) {
            addCriterion("column_type between", value1, value2, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("column_type not between", value1, value2, "columnType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeIsNull() {
            addCriterion("time_type is null");
            return (Criteria) this;
        }

        public Criteria andTimeTypeIsNotNull() {
            addCriterion("time_type is not null");
            return (Criteria) this;
        }

        public Criteria andTimeTypeEqualTo(Integer value) {
            addCriterion("time_type =", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeNotEqualTo(Integer value) {
            addCriterion("time_type <>", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeGreaterThan(Integer value) {
            addCriterion("time_type >", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_type >=", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeLessThan(Integer value) {
            addCriterion("time_type <", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("time_type <=", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeIn(List<Integer> values) {
            addCriterion("time_type in", values, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeNotIn(List<Integer> values) {
            addCriterion("time_type not in", values, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeBetween(Integer value1, Integer value2) {
            addCriterion("time_type between", value1, value2, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("time_type not between", value1, value2, "timeType");
            return (Criteria) this;
        }

        public Criteria andDefaultValueIsNull() {
            addCriterion("default_value is null");
            return (Criteria) this;
        }

        public Criteria andDefaultValueIsNotNull() {
            addCriterion("default_value is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultValueEqualTo(String value) {
            addCriterion("default_value =", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueNotEqualTo(String value) {
            addCriterion("default_value <>", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueGreaterThan(String value) {
            addCriterion("default_value >", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueGreaterThanOrEqualTo(String value) {
            addCriterion("default_value >=", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueLessThan(String value) {
            addCriterion("default_value <", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueLessThanOrEqualTo(String value) {
            addCriterion("default_value <=", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueLike(String value) {
            addCriterion("default_value like", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueNotLike(String value) {
            addCriterion("default_value not like", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueIn(List<String> values) {
            addCriterion("default_value in", values, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueNotIn(List<String> values) {
            addCriterion("default_value not in", values, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueBetween(String value1, String value2) {
            addCriterion("default_value between", value1, value2, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueNotBetween(String value1, String value2) {
            addCriterion("default_value not between", value1, value2, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andValueExtraIsNull() {
            addCriterion("value_extra is null");
            return (Criteria) this;
        }

        public Criteria andValueExtraIsNotNull() {
            addCriterion("value_extra is not null");
            return (Criteria) this;
        }

        public Criteria andValueExtraEqualTo(String value) {
            addCriterion("value_extra =", value, "valueExtra");
            return (Criteria) this;
        }

        public Criteria andValueExtraNotEqualTo(String value) {
            addCriterion("value_extra <>", value, "valueExtra");
            return (Criteria) this;
        }

        public Criteria andValueExtraGreaterThan(String value) {
            addCriterion("value_extra >", value, "valueExtra");
            return (Criteria) this;
        }

        public Criteria andValueExtraGreaterThanOrEqualTo(String value) {
            addCriterion("value_extra >=", value, "valueExtra");
            return (Criteria) this;
        }

        public Criteria andValueExtraLessThan(String value) {
            addCriterion("value_extra <", value, "valueExtra");
            return (Criteria) this;
        }

        public Criteria andValueExtraLessThanOrEqualTo(String value) {
            addCriterion("value_extra <=", value, "valueExtra");
            return (Criteria) this;
        }

        public Criteria andValueExtraLike(String value) {
            addCriterion("value_extra like", value, "valueExtra");
            return (Criteria) this;
        }

        public Criteria andValueExtraNotLike(String value) {
            addCriterion("value_extra not like", value, "valueExtra");
            return (Criteria) this;
        }

        public Criteria andValueExtraIn(List<String> values) {
            addCriterion("value_extra in", values, "valueExtra");
            return (Criteria) this;
        }

        public Criteria andValueExtraNotIn(List<String> values) {
            addCriterion("value_extra not in", values, "valueExtra");
            return (Criteria) this;
        }

        public Criteria andValueExtraBetween(String value1, String value2) {
            addCriterion("value_extra between", value1, value2, "valueExtra");
            return (Criteria) this;
        }

        public Criteria andValueExtraNotBetween(String value1, String value2) {
            addCriterion("value_extra not between", value1, value2, "valueExtra");
            return (Criteria) this;
        }

        public Criteria andIdSupportTypeIsNull() {
            addCriterion("id_support_type is null");
            return (Criteria) this;
        }

        public Criteria andIdSupportTypeIsNotNull() {
            addCriterion("id_support_type is not null");
            return (Criteria) this;
        }

        public Criteria andIdSupportTypeEqualTo(String value) {
            addCriterion("id_support_type =", value, "idSupportType");
            return (Criteria) this;
        }

        public Criteria andIdSupportTypeNotEqualTo(String value) {
            addCriterion("id_support_type <>", value, "idSupportType");
            return (Criteria) this;
        }

        public Criteria andIdSupportTypeGreaterThan(String value) {
            addCriterion("id_support_type >", value, "idSupportType");
            return (Criteria) this;
        }

        public Criteria andIdSupportTypeGreaterThanOrEqualTo(String value) {
            addCriterion("id_support_type >=", value, "idSupportType");
            return (Criteria) this;
        }

        public Criteria andIdSupportTypeLessThan(String value) {
            addCriterion("id_support_type <", value, "idSupportType");
            return (Criteria) this;
        }

        public Criteria andIdSupportTypeLessThanOrEqualTo(String value) {
            addCriterion("id_support_type <=", value, "idSupportType");
            return (Criteria) this;
        }

        public Criteria andIdSupportTypeLike(String value) {
            addCriterion("id_support_type like", value, "idSupportType");
            return (Criteria) this;
        }

        public Criteria andIdSupportTypeNotLike(String value) {
            addCriterion("id_support_type not like", value, "idSupportType");
            return (Criteria) this;
        }

        public Criteria andIdSupportTypeIn(List<String> values) {
            addCriterion("id_support_type in", values, "idSupportType");
            return (Criteria) this;
        }

        public Criteria andIdSupportTypeNotIn(List<String> values) {
            addCriterion("id_support_type not in", values, "idSupportType");
            return (Criteria) this;
        }

        public Criteria andIdSupportTypeBetween(String value1, String value2) {
            addCriterion("id_support_type between", value1, value2, "idSupportType");
            return (Criteria) this;
        }

        public Criteria andIdSupportTypeNotBetween(String value1, String value2) {
            addCriterion("id_support_type not between", value1, value2, "idSupportType");
            return (Criteria) this;
        }

        public Criteria andDemandListIsNull() {
            addCriterion("demand_list is null");
            return (Criteria) this;
        }

        public Criteria andDemandListIsNotNull() {
            addCriterion("demand_list is not null");
            return (Criteria) this;
        }

        public Criteria andDemandListEqualTo(String value) {
            addCriterion("demand_list =", value, "demandList");
            return (Criteria) this;
        }

        public Criteria andDemandListNotEqualTo(String value) {
            addCriterion("demand_list <>", value, "demandList");
            return (Criteria) this;
        }

        public Criteria andDemandListGreaterThan(String value) {
            addCriterion("demand_list >", value, "demandList");
            return (Criteria) this;
        }

        public Criteria andDemandListGreaterThanOrEqualTo(String value) {
            addCriterion("demand_list >=", value, "demandList");
            return (Criteria) this;
        }

        public Criteria andDemandListLessThan(String value) {
            addCriterion("demand_list <", value, "demandList");
            return (Criteria) this;
        }

        public Criteria andDemandListLessThanOrEqualTo(String value) {
            addCriterion("demand_list <=", value, "demandList");
            return (Criteria) this;
        }

        public Criteria andDemandListLike(String value) {
            addCriterion("demand_list like", value, "demandList");
            return (Criteria) this;
        }

        public Criteria andDemandListNotLike(String value) {
            addCriterion("demand_list not like", value, "demandList");
            return (Criteria) this;
        }

        public Criteria andDemandListIn(List<String> values) {
            addCriterion("demand_list in", values, "demandList");
            return (Criteria) this;
        }

        public Criteria andDemandListNotIn(List<String> values) {
            addCriterion("demand_list not in", values, "demandList");
            return (Criteria) this;
        }

        public Criteria andDemandListBetween(String value1, String value2) {
            addCriterion("demand_list between", value1, value2, "demandList");
            return (Criteria) this;
        }

        public Criteria andDemandListNotBetween(String value1, String value2) {
            addCriterion("demand_list not between", value1, value2, "demandList");
            return (Criteria) this;
        }

        public Criteria andBuilderIsNull() {
            addCriterion("builder is null");
            return (Criteria) this;
        }

        public Criteria andBuilderIsNotNull() {
            addCriterion("builder is not null");
            return (Criteria) this;
        }

        public Criteria andBuilderEqualTo(String value) {
            addCriterion("builder =", value, "builder");
            return (Criteria) this;
        }

        public Criteria andBuilderNotEqualTo(String value) {
            addCriterion("builder <>", value, "builder");
            return (Criteria) this;
        }

        public Criteria andBuilderGreaterThan(String value) {
            addCriterion("builder >", value, "builder");
            return (Criteria) this;
        }

        public Criteria andBuilderGreaterThanOrEqualTo(String value) {
            addCriterion("builder >=", value, "builder");
            return (Criteria) this;
        }

        public Criteria andBuilderLessThan(String value) {
            addCriterion("builder <", value, "builder");
            return (Criteria) this;
        }

        public Criteria andBuilderLessThanOrEqualTo(String value) {
            addCriterion("builder <=", value, "builder");
            return (Criteria) this;
        }

        public Criteria andBuilderLike(String value) {
            addCriterion("builder like", value, "builder");
            return (Criteria) this;
        }

        public Criteria andBuilderNotLike(String value) {
            addCriterion("builder not like", value, "builder");
            return (Criteria) this;
        }

        public Criteria andBuilderIn(List<String> values) {
            addCriterion("builder in", values, "builder");
            return (Criteria) this;
        }

        public Criteria andBuilderNotIn(List<String> values) {
            addCriterion("builder not in", values, "builder");
            return (Criteria) this;
        }

        public Criteria andBuilderBetween(String value1, String value2) {
            addCriterion("builder between", value1, value2, "builder");
            return (Criteria) this;
        }

        public Criteria andBuilderNotBetween(String value1, String value2) {
            addCriterion("builder not between", value1, value2, "builder");
            return (Criteria) this;
        }

        public Criteria andOthersIsNull() {
            addCriterion("others is null");
            return (Criteria) this;
        }

        public Criteria andOthersIsNotNull() {
            addCriterion("others is not null");
            return (Criteria) this;
        }

        public Criteria andOthersEqualTo(String value) {
            addCriterion("others =", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotEqualTo(String value) {
            addCriterion("others <>", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersGreaterThan(String value) {
            addCriterion("others >", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersGreaterThanOrEqualTo(String value) {
            addCriterion("others >=", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLessThan(String value) {
            addCriterion("others <", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLessThanOrEqualTo(String value) {
            addCriterion("others <=", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLike(String value) {
            addCriterion("others like", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotLike(String value) {
            addCriterion("others not like", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersIn(List<String> values) {
            addCriterion("others in", values, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotIn(List<String> values) {
            addCriterion("others not in", values, "others");
            return (Criteria) this;
        }

        public Criteria andOthersBetween(String value1, String value2) {
            addCriterion("others between", value1, value2, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotBetween(String value1, String value2) {
            addCriterion("others not between", value1, value2, "others");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：tag
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 标签表 
     * Criterion
     * 数据库表：tag
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