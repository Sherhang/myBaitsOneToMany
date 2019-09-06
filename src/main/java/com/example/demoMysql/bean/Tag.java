package com.example.demoMysql.bean;

import java.util.Date;

public class Tag {
    /**
     * tag_id
     * 表字段 : tag.tag_id
     */
    private Long tagId;

    /**
     * tag名称
     * 表字段 : tag.tag_name
     */
    private String tagName;

    /**
     * 大类id
     * 表字段 : tag.broad_kind_id
     */
    private Integer broadKindId;

    /**
     * 细分类id
     * 表字段 : tag.detail_kind_id
     */
    private Integer detailKindId;

    /**
     * 字段类型
     * 表字段 : tag.val_type
     */
    private Integer valType;

    /**
     * 时效类型
     * 表字段 : tag.val_time_type
     */
    private Integer valTimeType;

    /**
     * 默认值
     * 表字段 : tag.default_value
     */
    private String defaultValue;

    /**
     * 取值说明
     * 表字段 : tag.val_extra_info
     */
    private String valExtraInfo;

    /**
     * 覆盖id类型
     * 表字段 : tag.id_cover_type
     */
    private String idCoverType;

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
     * 表字段 : tag.create_time
     */
    private Date createTime;

    /**
     * 更新时间
     * 表字段 : tag.update_time
     */
    private Date updateTime;

    private BroadKind broadKind;

    /**
     * 获取 tag_id 字段:tag.tag_id
     *
     * @return tag.tag_id, tag_id
     */
    public Long getTagId() {
        return tagId;
    }

    /**
     * 设置 tag_id 字段:tag.tag_id
     *
     * @param tagId the value for tag.tag_id, tag_id
     */
    public void setTagId(Long tagId) {
        this.tagId = tagId;
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
     * 获取 大类id 字段:tag.broad_kind_id
     *
     * @return tag.broad_kind_id, 大类id
     */
    public Integer getBroadKindId() {
        return broadKindId;
    }

    /**
     * 设置 大类id 字段:tag.broad_kind_id
     *
     * @param broadKindId the value for tag.broad_kind_id, 大类id
     */
    public void setBroadKindId(Integer broadKindId) {
        this.broadKindId = broadKindId;
    }

    /**
     * 获取 细分类id 字段:tag.detail_kind_id
     *
     * @return tag.detail_kind_id, 细分类id
     */
    public Integer getDetailKindId() {
        return detailKindId;
    }

    /**
     * 设置 细分类id 字段:tag.detail_kind_id
     *
     * @param detailKindId the value for tag.detail_kind_id, 细分类id
     */
    public void setDetailKindId(Integer detailKindId) {
        this.detailKindId = detailKindId;
    }

    /**
     * 获取 字段类型 字段:tag.val_type
     *
     * @return tag.val_type, 字段类型
     */
    public Integer getValType() {
        return valType;
    }

    /**
     * 设置 字段类型 字段:tag.val_type
     *
     * @param valType the value for tag.val_type, 字段类型
     */
    public void setValType(Integer valType) {
        this.valType = valType;
    }

    /**
     * 获取 时效类型 字段:tag.val_time_type
     *
     * @return tag.val_time_type, 时效类型
     */
    public Integer getValTimeType() {
        return valTimeType;
    }

    /**
     * 设置 时效类型 字段:tag.val_time_type
     *
     * @param valTimeType the value for tag.val_time_type, 时效类型
     */
    public void setValTimeType(Integer valTimeType) {
        this.valTimeType = valTimeType;
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
     * 获取 取值说明 字段:tag.val_extra_info
     *
     * @return tag.val_extra_info, 取值说明
     */
    public String getValExtraInfo() {
        return valExtraInfo;
    }

    /**
     * 设置 取值说明 字段:tag.val_extra_info
     *
     * @param valExtraInfo the value for tag.val_extra_info, 取值说明
     */
    public void setValExtraInfo(String valExtraInfo) {
        this.valExtraInfo = valExtraInfo == null ? null : valExtraInfo.trim();
    }

    /**
     * 获取 覆盖id类型 字段:tag.id_cover_type
     *
     * @return tag.id_cover_type, 覆盖id类型
     */
    public String getIdCoverType() {
        return idCoverType;
    }

    /**
     * 设置 覆盖id类型 字段:tag.id_cover_type
     *
     * @param idCoverType the value for tag.id_cover_type, 覆盖id类型
     */
    public void setIdCoverType(String idCoverType) {
        this.idCoverType = idCoverType == null ? null : idCoverType.trim();
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
     * 获取 创建时间 字段:tag.create_time
     *
     * @return tag.create_time, 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间 字段:tag.create_time
     *
     * @param createTime the value for tag.create_time, 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 更新时间 字段:tag.update_time
     *
     * @return tag.update_time, 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 更新时间 字段:tag.update_time
     *
     * @param updateTime the value for tag.update_time, 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public BroadKind getBroadKind() {
        return broadKind;
    }

    public void setBroadKind(BroadKind broadKind) {
        this.broadKind=broadKind;
    }
}