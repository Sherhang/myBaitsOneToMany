package com.example.demoMysql.bean;

import java.util.Date;

public class Site {
    /**
     * 站点id
     * 表字段 : site.site_id
     */
    private Integer siteId;

    /**
     * 平台
     * 表字段 : site.platform
     */
    private String platform;

    /**
     * 创建时间
     * 表字段 : site.create_time
     */
    private Date createTime;

    /**
     * 更新时间
     * 表字段 : site.update_time
     */
    private Date updateTime;

    /**
     * 获取 站点id 字段:site.site_id
     *
     * @return site.site_id, 站点id
     */
    public Integer getSiteId() {
        return siteId;
    }

    /**
     * 设置 站点id 字段:site.site_id
     *
     * @param siteId the value for site.site_id, 站点id
     */
    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    /**
     * 获取 平台 字段:site.platform
     *
     * @return site.platform, 平台
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * 设置 平台 字段:site.platform
     *
     * @param platform the value for site.platform, 平台
     */
    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    /**
     * 获取 创建时间 字段:site.create_time
     *
     * @return site.create_time, 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间 字段:site.create_time
     *
     * @param createTime the value for site.create_time, 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 更新时间 字段:site.update_time
     *
     * @return site.update_time, 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 更新时间 字段:site.update_time
     *
     * @param updateTime the value for site.update_time, 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}