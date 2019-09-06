package com.example.demoMysql.bean;

import java.util.Date;

public class SiteTag {
    /**
     * 平台id
     * 表字段 : site_tag.site_id
     */
    private Integer siteId;

    /**
     * tagid
     * 表字段 : site_tag.tag_id
     */
    private Long tagId;

    /**
     * 取值说明
     * 表字段 : site_tag.val_extra_info
     */
    private String valExtraInfo;

    /**
     * tdw表
     * 表字段 : site_tag.tdw_table
     */
    private String tdwTable;

    /**
     * tdw列
     * 表字段 : site_tag.tdw_field
     */
    private String tdwField;

    /**
     * 创建时间
     * 表字段 : site_tag.create_time
     */
    private Date createTime;

    /**
     * 更新时间
     * 表字段 : site_tag.update_time
     */
    private Date updateTime;

    private Site site;

    private Tag tag;

    /**
     * 获取 平台id 字段:site_tag.site_id
     *
     * @return site_tag.site_id, 平台id
     */
    public Integer getSiteId() {
        return siteId;
    }

    /**
     * 设置 平台id 字段:site_tag.site_id
     *
     * @param siteId the value for site_tag.site_id, 平台id
     */
    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    /**
     * 获取 tagid 字段:site_tag.tag_id
     *
     * @return site_tag.tag_id, tagid
     */
    public Long getTagId() {
        return tagId;
    }

    /**
     * 设置 tagid 字段:site_tag.tag_id
     *
     * @param tagId the value for site_tag.tag_id, tagid
     */
    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    /**
     * 获取 取值说明 字段:site_tag.val_extra_info
     *
     * @return site_tag.val_extra_info, 取值说明
     */
    public String getValExtraInfo() {
        return valExtraInfo;
    }

    /**
     * 设置 取值说明 字段:site_tag.val_extra_info
     *
     * @param valExtraInfo the value for site_tag.val_extra_info, 取值说明
     */
    public void setValExtraInfo(String valExtraInfo) {
        this.valExtraInfo = valExtraInfo == null ? null : valExtraInfo.trim();
    }

    /**
     * 获取 tdw表 字段:site_tag.tdw_table
     *
     * @return site_tag.tdw_table, tdw表
     */
    public String getTdwTable() {
        return tdwTable;
    }

    /**
     * 设置 tdw表 字段:site_tag.tdw_table
     *
     * @param tdwTable the value for site_tag.tdw_table, tdw表
     */
    public void setTdwTable(String tdwTable) {
        this.tdwTable = tdwTable == null ? null : tdwTable.trim();
    }

    /**
     * 获取 tdw列 字段:site_tag.tdw_field
     *
     * @return site_tag.tdw_field, tdw列
     */
    public String getTdwField() {
        return tdwField;
    }

    /**
     * 设置 tdw列 字段:site_tag.tdw_field
     *
     * @param tdwField the value for site_tag.tdw_field, tdw列
     */
    public void setTdwField(String tdwField) {
        this.tdwField = tdwField == null ? null : tdwField.trim();
    }

    /**
     * 获取 创建时间 字段:site_tag.create_time
     *
     * @return site_tag.create_time, 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间 字段:site_tag.create_time
     *
     * @param createTime the value for site_tag.create_time, 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 更新时间 字段:site_tag.update_time
     *
     * @return site_tag.update_time, 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 更新时间 字段:site_tag.update_time
     *
     * @param updateTime the value for site_tag.update_time, 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site=site;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag=tag;
    }
}