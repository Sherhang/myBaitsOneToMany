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

        public Criteria andDetailKindIdIsNull() {
            addCriterion("detail_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andDetailKindIdIsNotNull() {
            addCriterion("detail_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andDetailKindIdEqualTo(Integer value) {
            addCriterion("detail_kind_id =", value, "detailKindId");
            return (Criteria) this;
        }

        public Criteria andDetailKindIdNotEqualTo(Integer value) {
            addCriterion("detail_kind_id <>", value, "detailKindId");
            return (Criteria) this;
        }

        public Criteria andDetailKindIdGreaterThan(Integer value) {
            addCriterion("detail_kind_id >", value, "detailKindId");
            return (Criteria) this;
        }

        public Criteria andDetailKindIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("detail_kind_id >=", value, "detailKindId");
            return (Criteria) this;
        }

        public Criteria andDetailKindIdLessThan(Integer value) {
            addCriterion("detail_kind_id <", value, "detailKindId");
            return (Criteria) this;
        }

        public Criteria andDetailKindIdLessThanOrEqualTo(Integer value) {
            addCriterion("detail_kind_id <=", value, "detailKindId");
            return (Criteria) this;
        }

        public Criteria andDetailKindIdIn(List<Integer> values) {
            addCriterion("detail_kind_id in", values, "detailKindId");
            return (Criteria) this;
        }

        public Criteria andDetailKindIdNotIn(List<Integer> values) {
            addCriterion("detail_kind_id not in", values, "detailKindId");
            return (Criteria) this;
        }

        public Criteria andDetailKindIdBetween(Integer value1, Integer value2) {
            addCriterion("detail_kind_id between", value1, value2, "detailKindId");
            return (Criteria) this;
        }

        public Criteria andDetailKindIdNotBetween(Integer value1, Integer value2) {
            addCriterion("detail_kind_id not between", value1, value2, "detailKindId");
            return (Criteria) this;
        }

        public Criteria andValTypeIsNull() {
            addCriterion("val_type is null");
            return (Criteria) this;
        }

        public Criteria andValTypeIsNotNull() {
            addCriterion("val_type is not null");
            return (Criteria) this;
        }

        public Criteria andValTypeEqualTo(Integer value) {
            addCriterion("val_type =", value, "valType");
            return (Criteria) this;
        }

        public Criteria andValTypeNotEqualTo(Integer value) {
            addCriterion("val_type <>", value, "valType");
            return (Criteria) this;
        }

        public Criteria andValTypeGreaterThan(Integer value) {
            addCriterion("val_type >", value, "valType");
            return (Criteria) this;
        }

        public Criteria andValTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("val_type >=", value, "valType");
            return (Criteria) this;
        }

        public Criteria andValTypeLessThan(Integer value) {
            addCriterion("val_type <", value, "valType");
            return (Criteria) this;
        }

        public Criteria andValTypeLessThanOrEqualTo(Integer value) {
            addCriterion("val_type <=", value, "valType");
            return (Criteria) this;
        }

        public Criteria andValTypeIn(List<Integer> values) {
            addCriterion("val_type in", values, "valType");
            return (Criteria) this;
        }

        public Criteria andValTypeNotIn(List<Integer> values) {
            addCriterion("val_type not in", values, "valType");
            return (Criteria) this;
        }

        public Criteria andValTypeBetween(Integer value1, Integer value2) {
            addCriterion("val_type between", value1, value2, "valType");
            return (Criteria) this;
        }

        public Criteria andValTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("val_type not between", value1, value2, "valType");
            return (Criteria) this;
        }

        public Criteria andValTimeTypeIsNull() {
            addCriterion("val_time_type is null");
            return (Criteria) this;
        }

        public Criteria andValTimeTypeIsNotNull() {
            addCriterion("val_time_type is not null");
            return (Criteria) this;
        }

        public Criteria andValTimeTypeEqualTo(Integer value) {
            addCriterion("val_time_type =", value, "valTimeType");
            return (Criteria) this;
        }

        public Criteria andValTimeTypeNotEqualTo(Integer value) {
            addCriterion("val_time_type <>", value, "valTimeType");
            return (Criteria) this;
        }

        public Criteria andValTimeTypeGreaterThan(Integer value) {
            addCriterion("val_time_type >", value, "valTimeType");
            return (Criteria) this;
        }

        public Criteria andValTimeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("val_time_type >=", value, "valTimeType");
            return (Criteria) this;
        }

        public Criteria andValTimeTypeLessThan(Integer value) {
            addCriterion("val_time_type <", value, "valTimeType");
            return (Criteria) this;
        }

        public Criteria andValTimeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("val_time_type <=", value, "valTimeType");
            return (Criteria) this;
        }

        public Criteria andValTimeTypeIn(List<Integer> values) {
            addCriterion("val_time_type in", values, "valTimeType");
            return (Criteria) this;
        }

        public Criteria andValTimeTypeNotIn(List<Integer> values) {
            addCriterion("val_time_type not in", values, "valTimeType");
            return (Criteria) this;
        }

        public Criteria andValTimeTypeBetween(Integer value1, Integer value2) {
            addCriterion("val_time_type between", value1, value2, "valTimeType");
            return (Criteria) this;
        }

        public Criteria andValTimeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("val_time_type not between", value1, value2, "valTimeType");
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

        public Criteria andIdCoverTypeIsNull() {
            addCriterion("id_cover_type is null");
            return (Criteria) this;
        }

        public Criteria andIdCoverTypeIsNotNull() {
            addCriterion("id_cover_type is not null");
            return (Criteria) this;
        }

        public Criteria andIdCoverTypeEqualTo(String value) {
            addCriterion("id_cover_type =", value, "idCoverType");
            return (Criteria) this;
        }

        public Criteria andIdCoverTypeNotEqualTo(String value) {
            addCriterion("id_cover_type <>", value, "idCoverType");
            return (Criteria) this;
        }

        public Criteria andIdCoverTypeGreaterThan(String value) {
            addCriterion("id_cover_type >", value, "idCoverType");
            return (Criteria) this;
        }

        public Criteria andIdCoverTypeGreaterThanOrEqualTo(String value) {
            addCriterion("id_cover_type >=", value, "idCoverType");
            return (Criteria) this;
        }

        public Criteria andIdCoverTypeLessThan(String value) {
            addCriterion("id_cover_type <", value, "idCoverType");
            return (Criteria) this;
        }

        public Criteria andIdCoverTypeLessThanOrEqualTo(String value) {
            addCriterion("id_cover_type <=", value, "idCoverType");
            return (Criteria) this;
        }

        public Criteria andIdCoverTypeLike(String value) {
            addCriterion("id_cover_type like", value, "idCoverType");
            return (Criteria) this;
        }

        public Criteria andIdCoverTypeNotLike(String value) {
            addCriterion("id_cover_type not like", value, "idCoverType");
            return (Criteria) this;
        }

        public Criteria andIdCoverTypeIn(List<String> values) {
            addCriterion("id_cover_type in", values, "idCoverType");
            return (Criteria) this;
        }

        public Criteria andIdCoverTypeNotIn(List<String> values) {
            addCriterion("id_cover_type not in", values, "idCoverType");
            return (Criteria) this;
        }

        public Criteria andIdCoverTypeBetween(String value1, String value2) {
            addCriterion("id_cover_type between", value1, value2, "idCoverType");
            return (Criteria) this;
        }

        public Criteria andIdCoverTypeNotBetween(String value1, String value2) {
            addCriterion("id_cover_type not between", value1, value2, "idCoverType");
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