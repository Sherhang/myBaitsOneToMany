package com.example.demoMysql.bean;

import java.util.Date;
import java.util.List;

public class ParentKind {
    /**
     * 种类id
     * 表字段 : parent_kind.id
     */
    private Integer id;

    /**
     * 种类名称
     * 表字段 : parent_kind.name
     */
    private String name;

    /**
     * 创建时间
     * 表字段 : parent_kind.created_at
     */
    private Date createdAt;

    /**
     * 更新时间
     * 表字段 : parent_kind.updated_at
     */
    private Date updatedAt;

    private List<Kind> kinds;

    /**
     * 获取 种类id 字段:parent_kind.id
     *
     * @return parent_kind.id, 种类id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 种类id 字段:parent_kind.id
     *
     * @param id the value for parent_kind.id, 种类id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 种类名称 字段:parent_kind.name
     *
     * @return parent_kind.name, 种类名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 种类名称 字段:parent_kind.name
     *
     * @param name the value for parent_kind.name, 种类名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取 创建时间 字段:parent_kind.created_at
     *
     * @return parent_kind.created_at, 创建时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 设置 创建时间 字段:parent_kind.created_at
     *
     * @param createdAt the value for parent_kind.created_at, 创建时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 获取 更新时间 字段:parent_kind.updated_at
     *
     * @return parent_kind.updated_at, 更新时间
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 设置 更新时间 字段:parent_kind.updated_at
     *
     * @param updatedAt the value for parent_kind.updated_at, 更新时间
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<Kind> getKinds() {
        return kinds;
    }

    public void setKinds(List<Kind> kinds) {
        this.kinds=kinds;
    }
}