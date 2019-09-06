package com.example.demoMysql.bean;

import java.util.Date;

public class BroadKind {
    /**
     * 大类id
     * 表字段 : broad_kind.broad_kind_id
     */
    private Integer broadKindId;

    /**
     * 种类id
     * 表字段 : broad_kind.kind_id
     */
    private Integer kindId;

    /**
     * 大类名称
     * 表字段 : broad_kind.broad_kind_name
     */
    private String broadKindName;

    /**
     * 创建时间
     * 表字段 : broad_kind.create_time
     */
    private Date createTime;

    /**
     * 更新时间
     * 表字段 : broad_kind.update_time
     */
    private Date updateTime;

    private Kind kind;

    /**
     * 获取 大类id 字段:broad_kind.broad_kind_id
     *
     * @return broad_kind.broad_kind_id, 大类id
     */
    public Integer getBroadKindId() {
        return broadKindId;
    }

    /**
     * 设置 大类id 字段:broad_kind.broad_kind_id
     *
     * @param broadKindId the value for broad_kind.broad_kind_id, 大类id
     */
    public void setBroadKindId(Integer broadKindId) {
        this.broadKindId = broadKindId;
    }

    /**
     * 获取 种类id 字段:broad_kind.kind_id
     *
     * @return broad_kind.kind_id, 种类id
     */
    public Integer getKindId() {
        return kindId;
    }

    /**
     * 设置 种类id 字段:broad_kind.kind_id
     *
     * @param kindId the value for broad_kind.kind_id, 种类id
     */
    public void setKindId(Integer kindId) {
        this.kindId = kindId;
    }

    /**
     * 获取 大类名称 字段:broad_kind.broad_kind_name
     *
     * @return broad_kind.broad_kind_name, 大类名称
     */
    public String getBroadKindName() {
        return broadKindName;
    }

    /**
     * 设置 大类名称 字段:broad_kind.broad_kind_name
     *
     * @param broadKindName the value for broad_kind.broad_kind_name, 大类名称
     */
    public void setBroadKindName(String broadKindName) {
        this.broadKindName = broadKindName == null ? null : broadKindName.trim();
    }

    /**
     * 获取 创建时间 字段:broad_kind.create_time
     *
     * @return broad_kind.create_time, 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间 字段:broad_kind.create_time
     *
     * @param createTime the value for broad_kind.create_time, 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 更新时间 字段:broad_kind.update_time
     *
     * @return broad_kind.update_time, 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 更新时间 字段:broad_kind.update_time
     *
     * @param updateTime the value for broad_kind.update_time, 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind=kind;
    }
}