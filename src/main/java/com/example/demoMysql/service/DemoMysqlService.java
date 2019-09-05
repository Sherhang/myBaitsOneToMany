//DemoMysqlService.java
//这一层方法返回实体，方便taf调用

package com.example.demoMysql.service;

import com.example.demoMysql.bean.TagExample;
import com.example.demoMysql.dao.*;
import com.example.demoMysql.bean.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.google.gson.Gson;

@Service
public class DemoMysqlService {

    //@Resource //在service层不能用这个
    @Autowired(required = false) //方法注入
    private TagMapper tagMapper;  //这里要和controller里面的名字不一样

    @Autowired(required = false)
    private BroadKindMapper broadKindMapper;

    @Autowired(required = false)
    private KindMapper kindMapper;

    @Autowired(required = false)
    private SiteMapper siteMapper;

    @Autowired(required = false)
    private SiteTagMapper siteTagMapper;

    // test
    public String test() {
        return "你是猪吗？";
    }

    //--> 查询整张表
    //获取tag表
    public List<Tag> getTags() {
        TagExample tagExample = new TagExample();
        List<Tag> ret = tagMapper.selectByExample(tagExample);
        return ret;
    }

    //获取site_tag表
    public List<SiteTag> getSiteTags() {
        SiteTagExample siteTagExample = new SiteTagExample();
        List<SiteTag> ret = siteTagMapper.selectByExample(siteTagExample);
        return ret;
    }

    //获取site表
    public List<Site> getSites() {
        SiteExample siteExample = new SiteExample();
        List<Site> ret = siteMapper.selectByExample(siteExample);
        return ret;
    }

    //获取 broad_kind 表
    public List<BroadKind> getBroadKinds() {
        BroadKindExample broadKindExample = new BroadKindExample();
        List<BroadKind> ret = broadKindMapper.selectByExample(broadKindExample);
        return ret;
    }

    //获取 kind 表
    public List<Kind> getKinds() {
        KindExample kindExample = new KindExample();
        List<Kind> ret = kindMapper.selectByExample(kindExample);
        return ret;
    }

    // 根据主键查询表
    //根据tag_id 获取 tag 表
    public Tag getTagById(long tag_id) {
        Tag tag = tagMapper.selectByPrimaryKey(tag_id);
        return tag;

    }

    //根据site_id, tag_id 获取site_tag
    public SiteTag getSiteTagById(int site_id, long tag_id) {
        SiteTag siteTag = siteTagMapper.selectByPrimaryKey(site_id, tag_id);
        return siteTag;

    }

    //根据 site_id 获取site
    public Site getSiteById(int site_id) {
        Site site = siteMapper.selectByPrimaryKey(site_id);
        return site;

    }

    //根据 broad_kind_id 获取 broad_kind
    public BroadKind getBroadKindById(int broad_kind_id) {
        BroadKind broadKind = broadKindMapper.selectByPrimaryKey(broad_kind_id);
        return broadKind;
    }

    //根据 kind_id 获取 kind
    public Kind getKindById(int kind_id) {
        Kind kind = kindMapper.selectByPrimaryKey(kind_id);
        System.out.println(kind); //com.example.demoMysql.bean.Kind@64dddcb2
        return kind;
    }

    //--->根据联合键查询
    //由种类 id 查询 大类
    public List<BroadKind> getBroadKindsByKindId(int kind_id){
        BroadKindExample broadKindExample = new BroadKindExample();
        BroadKindExample.Criteria criteria = broadKindExample.createCriteria();
        criteria.andKindIdEqualTo(kind_id); //条件筛选
        List<BroadKind> ret = broadKindMapper.selectByExample(broadKindExample);
        return ret;
    }

}
