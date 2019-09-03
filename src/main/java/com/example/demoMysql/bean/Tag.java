package com.example.demoMysql.bean;

import java.util.Date;
import java.util.List;

public class Tag {
    /**
     * tag编号
     * 表字段 : tag.id
     */
    private Long id;

    /**
     * tag名称
     * 表字段 : tag.tag_name
     */
    private String tagName;

    /**
     * 大类id
     * 表字段 : tag.child_kind_id
     */
    private Integer childKindId;

    /**
     * 细分类id
     * 表字段 : tag.detail_id
     */
    private Integer detailId;

    /**
     * 字段类型
     * 表字段 : tag.column_type
     */
    private Integer columnType;

    /**
     * 时效类型
     * 表字段 : tag.time_type
     */
    private Integer timeType;

    /**
     * 默认值
     * 表字段 : tag.default_value
     */
    private String defaultValue;

    /**
     * 取值说明
     * 表字段 : tag.value_extra
     */
    private String valueExtra;

    /**
     * 覆盖id类型
     * 表字段 : tag.id_support_type
     */
    private String idSupportType;

    /**
     * 需求列表
     * 表字段 : tag.demand_list
     */
    private String demandList;

    /**
     * 建设方
     * 表字段 : tag.builder
     */
    private String builder;

    /**
     * 其他
     * 表字段 : tag.others
     */
    private String others;

    /**
     * 创建时间
     * 表字段 : tag.created_at
     */
    private Date createdAt;

    /**
     * 更新时间
     * 表字段 : tag.updated_at
     */
    private Date updatedAt;

    private List<SiteTag> siteTags;

    private Kind kind;

    /**
     * 获取 tag编号 字段:tag.id
     *
     * @return tag.id, tag编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 tag编号 字段:tag.id
     *
     * @param id the value for tag.id, tag编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 tag名称 字段:tag.tag_name
     *
     * @return tag.tag_name, tag名称
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * 设置 tag名称 字段:tag.tag_name
     *
     * @param tagName the value for tag.tag_name, tag名称
     */
    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    /**
     * 获取 大类id 字段:tag.child_kind_id
     *
     * @return tag.child_kind_id, 大类id
     */
    public Integer getChildKindId() {
        return childKindId;
    }

    /**
     * 设置 大类id 字段:tag.child_kind_id
     *
     * @param childKindId the value for tag.child_kind_id, 大类id
     */
    public void setChildKindId(Integer childKindId) {
        this.childKindId = childKindId;
    }

    /**
     * 获取 细分类id 字段:tag.detail_id
     *
     * @return tag.detail_id, 细分类id
     */
    public Integer getDetailId() {
        return detailId;
    }

    /**
     * 设置 细分类id 字段:tag.detail_id
     *
     * @param detailId the value for tag.detail_id, 细分类id
     */
    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    /**
     * 获取 字段类型 字段:tag.column_type
     *
     * @return tag.column_type, 字段类型
     */
    public Integer getColumnType() {
        return columnType;
    }

    /**
     * 设置 字段类型 字段:tag.column_type
     *
     * @param columnType the value for tag.column_type, 字段类型
     */
    public void setColumnType(Integer columnType) {
        this.columnType = columnType;
    }

    /**
     * 获取 时效类型 字段:tag.time_type
     *
     * @return tag.time_type, 时效类型
     */
    public Integer getTimeType() {
        return timeType;
    }

    /**
     * 设置 时效类型 字段:tag.time_type
     *
     * @param timeType the value for tag.time_type, 时效类型
     */
    public void setTimeType(Integer timeType) {
        this.timeType = timeType;
    }

    /**
     * 获取 默认值 字段:tag.default_value
     *
     * @return tag.default_value, 默认值
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * 设置 默认值 字段:tag.default_value
     *
     * @param defaultValue the value for tag.default_value, 默认值
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue == null ? null : defaultValue.trim();
    }

    /**
     * 获取 取值说明 字段:tag.value_extra
     *
     * @return tag.value_extra, 取值说明
     */
    public String getValueExtra() {
        return valueExtra;
    }

    /**
     * 设置 取值说明 字段:tag.value_extra
     *
     * @param valueExtra the value for tag.value_extra, 取值说明
     */
    public void setValueExtra(String valueExtra) {
        this.valueExtra = valueExtra == null ? null : valueExtra.trim();
    }

    /**
     * 获取 覆盖id类型 字段:tag.id_support_type
     *
     * @return tag.id_support_type, 覆盖id类型
     */
    public String getIdSupportType() {
        return idSupportType;
    }

    /**
     * 设置 覆盖id类型 字段:tag.id_support_type
     *
     * @param idSupportType the value for tag.id_support_type, 覆盖id类型
     */
    public void setIdSupportType(String idSupportType) {
        this.idSupportType = idSupportType == null ? null : idSupportType.trim();
    }

    /**
     * 获取 需求列表 字段:tag.demand_list
     *
     * @return tag.demand_list, 需求列表
     */
    public String getDemandList() {
        return demandList;
    }

    /**
     * 设置 需求列表 字段:tag.demand_list
     *
     * @param demandList the value for tag.demand_list, 需求列表
     */
    public void setDemandList(String demandList) {
        this.demandList = demandList == null ? null : demandList.trim();
    }

    /**
     * 获取 建设方 字段:tag.builder
     *
     * @return tag.builder, 建设方
     */
    public String getBuilder() {
        return builder;
    }

    /**
     * 设置 建设方 字段:tag.builder
     *
     * @param builder the value for tag.builder, 建设方
     */
    public void setBuilder(String builder) {
        this.builder = builder == null ? null : builder.trim();
    }

    /**
     * 获取 其他 字段:tag.others
     *
     * @return tag.others, 其他
     */
    public String getOthers() {
        return others;
    }

    /**
     * 设置 其他 字段:tag.others
     *
     * @param others the value for tag.others, 其他
     */
    public void setOthers(String others) {
        this.others = others == null ? null : others.trim();
    }

    /**
     * 获取 创建时间 字段:tag.created_at
     *
     * @return tag.created_at, 创建时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 设置 创建时间 字段:tag.created_at
     *
     * @param createdAt the value for tag.created_at, 创建时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 获取 更新时间 字段:tag.updated_at
     *
     * @return tag.updated_at, 更新时间
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 设置 更新时间 字段:tag.updated_at
     *
     * @param updatedAt the value for tag.updated_at, 更新时间
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<SiteTag> getSiteTags() {
        return siteTags;
    }

    public void setSiteTags(List<SiteTag> siteTags) {
        this.siteTags=siteTags;
    }

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind=kind;
    }
}