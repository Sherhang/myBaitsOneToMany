package com.example.demoMysql.bean;

public class SiteTag {
    /**
     * 
     * 表字段 : site_tag.site_id
     */
    private Long siteId;

    /**
     * 
     * 表字段 : site_tag.tag_id
     */
    private Double tagId;

    /**
     * 
     * 表字段 : site_tag.tdw_column
     */
    private Double tdwColumn;

    /**
     * 
     * 表字段 : site_tag.tdw_table
     */
    private String tdwTable;

    /**
     * 
     * 表字段 : site_tag.value_extra
     */
    private String valueExtra;

    /**
     * 
     * 表字段 : site_tag.created_at
     */
    private String createdAt;

    /**
     * 
     * 表字段 : site_tag.updated_at
     */
    private String updatedAt;

    private Tag tag;

    /**
     * 获取  字段:site_tag.site_id
     *
     * @return site_tag.site_id, 
     */
    public Long getSiteId() {
        return siteId;
    }

    /**
     * 设置  字段:site_tag.site_id
     *
     * @param siteId the value for site_tag.site_id, 
     */
    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    /**
     * 获取  字段:site_tag.tag_id
     *
     * @return site_tag.tag_id, 
     */
    public Double getTagId() {
        return tagId;
    }

    /**
     * 设置  字段:site_tag.tag_id
     *
     * @param tagId the value for site_tag.tag_id, 
     */
    public void setTagId(Double tagId) {
        this.tagId = tagId;
    }

    /**
     * 获取  字段:site_tag.tdw_column
     *
     * @return site_tag.tdw_column, 
     */
    public Double getTdwColumn() {
        return tdwColumn;
    }

    /**
     * 设置  字段:site_tag.tdw_column
     *
     * @param tdwColumn the value for site_tag.tdw_column, 
     */
    public void setTdwColumn(Double tdwColumn) {
        this.tdwColumn = tdwColumn;
    }

    /**
     * 获取  字段:site_tag.tdw_table
     *
     * @return site_tag.tdw_table, 
     */
    public String getTdwTable() {
        return tdwTable;
    }

    /**
     * 设置  字段:site_tag.tdw_table
     *
     * @param tdwTable the value for site_tag.tdw_table, 
     */
    public void setTdwTable(String tdwTable) {
        this.tdwTable = tdwTable == null ? null : tdwTable.trim();
    }

    /**
     * 获取  字段:site_tag.value_extra
     *
     * @return site_tag.value_extra, 
     */
    public String getValueExtra() {
        return valueExtra;
    }

    /**
     * 设置  字段:site_tag.value_extra
     *
     * @param valueExtra the value for site_tag.value_extra, 
     */
    public void setValueExtra(String valueExtra) {
        this.valueExtra = valueExtra == null ? null : valueExtra.trim();
    }

    /**
     * 获取  字段:site_tag.created_at
     *
     * @return site_tag.created_at, 
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 设置  字段:site_tag.created_at
     *
     * @param createdAt the value for site_tag.created_at, 
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt == null ? null : createdAt.trim();
    }

    /**
     * 获取  字段:site_tag.updated_at
     *
     * @return site_tag.updated_at, 
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 设置  字段:site_tag.updated_at
     *
     * @param updatedAt the value for site_tag.updated_at, 
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt == null ? null : updatedAt.trim();
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag=tag;
    }
}