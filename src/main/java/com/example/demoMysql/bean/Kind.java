package com.example.demoMysql.bean;

import java.util.Date;

public class Kind {
    /**
     * 种类id
     * 表字段 : kind.kind_id
     */
    private Integer kindId;

    /**
     * 种类名称
     * 表字段 : kind.kind_name
     */
    private String kindName;

    /**
     * 创建时间
     * 表字段 : kind.create_time
     */
    private Date createTime;

    /**
     * 更新时间
     * 表字段 : kind.update_time
     */
    private Date updateTime;

    /**
     * 获取 种类id 字段:kind.kind_id
     *
     * @return kind.kind_id, 种类id
     */
    public Integer getKindId() {
        return kindId;
    }

    /**
     * 设置 种类id 字段:kind.kind_id
     *
     * @param kindId the value for kind.kind_id, 种类id
     */
    public void setKindId(Integer kindId) {
        this.kindId = kindId;
    }

    /**
     * 获取 种类名称 字段:kind.kind_name
     *
     * @return kind.kind_name, 种类名称
     */
    public String getKindName() {
        return kindName;
    }

    /**
     * 设置 种类名称 字段:kind.kind_name
     *
     * @param kindName the value for kind.kind_name, 种类名称
     */
    public void setKindName(String kindName) {
        this.kindName = kindName == null ? null : kindName.trim();
    }

    /**
     * 获取 创建时间 字段:kind.create_time
     *
     * @return kind.create_time, 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间 字段:kind.create_time
     *
     * @param createTime the value for kind.create_time, 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 更新时间 字段:kind.update_time
     *
     * @return kind.update_time, 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 更新时间 字段:kind.update_time
     *
     * @param updateTime the value for kind.update_time, 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}