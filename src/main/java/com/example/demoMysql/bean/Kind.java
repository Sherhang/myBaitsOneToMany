package com.example.demoMysql.bean;

import java.util.Date;
import java.util.List;

public class Kind {
    /**
     * 大类id
     * 表字段 : kind.id
     */
    private Integer id;

    /**
     * 种类id
     * 表字段 : kind.parent_kind_id
     */
    private Integer parentKindId;

    /**
     * 大类名称
     * 表字段 : kind.name
     */
    private String name;

    /**
     * 创建时间
     * 表字段 : kind.created_at
     */
    private Date createdAt;

    /**
     * 更新时间
     * 表字段 : kind.updated_at
     */
    private Date updatedAt;

    private List<Tag> tags;

    private ParentKind parentKind;

    /**
     * 获取 大类id 字段:kind.id
     *
     * @return kind.id, 大类id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 大类id 字段:kind.id
     *
     * @param id the value for kind.id, 大类id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 种类id 字段:kind.parent_kind_id
     *
     * @return kind.parent_kind_id, 种类id
     */
    public Integer getParentKindId() {
        return parentKindId;
    }

    /**
     * 设置 种类id 字段:kind.parent_kind_id
     *
     * @param parentKindId the value for kind.parent_kind_id, 种类id
     */
    public void setParentKindId(Integer parentKindId) {
        this.parentKindId = parentKindId;
    }

    /**
     * 获取 大类名称 字段:kind.name
     *
     * @return kind.name, 大类名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 大类名称 字段:kind.name
     *
     * @param name the value for kind.name, 大类名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取 创建时间 字段:kind.created_at
     *
     * @return kind.created_at, 创建时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 设置 创建时间 字段:kind.created_at
     *
     * @param createdAt the value for kind.created_at, 创建时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 获取 更新时间 字段:kind.updated_at
     *
     * @return kind.updated_at, 更新时间
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 设置 更新时间 字段:kind.updated_at
     *
     * @param updatedAt the value for kind.updated_at, 更新时间
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags=tags;
    }

    public ParentKind getParentKind() {
        return parentKind;
    }

    public void setParentKind(ParentKind parentKind) {
        this.parentKind=parentKind;
    }
}