package com.example.demoMysql.bean;

public class Site {
    /**
     * 
     * 表字段 : site.id
     */
    private Long id;

    /**
     * 
     * 表字段 : site.platform
     */
    private String platform;

    /**
     * 
     * 表字段 : site.created_at
     */
    private String createdAt;

    /**
     * 
     * 表字段 : site.updated_at
     */
    private String updatedAt;

    private SiteTag siteTag;

    /**
     * 获取  字段:site.id
     *
     * @return site.id, 
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置  字段:site.id
     *
     * @param id the value for site.id, 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取  字段:site.platform
     *
     * @return site.platform, 
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * 设置  字段:site.platform
     *
     * @param platform the value for site.platform, 
     */
    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    /**
     * 获取  字段:site.created_at
     *
     * @return site.created_at, 
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 设置  字段:site.created_at
     *
     * @param createdAt the value for site.created_at, 
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt == null ? null : createdAt.trim();
    }

    /**
     * 获取  字段:site.updated_at
     *
     * @return site.updated_at, 
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 设置  字段:site.updated_at
     *
     * @param updatedAt the value for site.updated_at, 
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt == null ? null : updatedAt.trim();
    }

    public SiteTag getSiteTag() {
        return siteTag;
    }

    public void setSiteTag(SiteTag siteTag) {
        this.siteTag=siteTag;
    }
}