//DemoMysqlService.java

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
    public String test(){
        return "你是猪吗？";
    }

    //--> 查询整张表
//    获取tag表
    public String getTags() {
        TagExample tagExample = new TagExample();
        List<Tag> ret = tagMapper.selectByExample(tagExample);
        Gson gson = new Gson();
        String json =  gson.toJson(ret);
        System.out.println(json);
        return json;
    }
    //获取site_tag表
    public String getSiteTags(){
        SiteTagExample siteTagExample = new SiteTagExample();
        List<SiteTag> ret = siteTagMapper.selectByExample(siteTagExample);
        Gson gson = new Gson();
        String json =  gson.toJson(ret);
        System.out.println(json);
        return json;
    }

    //获取site表
    public String getSites(){
        SiteExample siteExample = new SiteExample();
        List<Site> ret = siteMapper.selectByExample(siteExample);
        Gson gson = new Gson();
        String json =  gson.toJson(ret);
        System.out.println(json);
        return json;
    }
    //获取 broad_kind 表
    public String getBroadKinds(){
        BroadKindExample broadKindExample = new BroadKindExample();
        List<BroadKind> ret = broadKindMapper.selectByExample(broadKindExample);
        Gson gson = new Gson();
        String json =  gson.toJson(ret);
        System.out.println(json);
        return json;
    }
    //获取 kind 表
    public String getKinds(){
        KindExample kindExample = new KindExample();
        List<Kind> ret = kindMapper.selectByExample(kindExample);
        Gson gson = new Gson();
        String json =  gson.toJson(ret);
        System.out.println(json);
        return json;
    }

    // 根据主键查询
    //根据tag_id 获取 tag 表
    public String getTagById(long tag_id){
        Tag tag = tagMapper.selectByPrimaryKey(tag_id);
        Gson gson = new Gson();
        return gson.toJson(tag);
    }
    //根据site_id, tag_id 获取site_tag
    public String getSiteTagById(int site_id, long tag_id){
        SiteTag siteTag = siteTagMapper.selectByPrimaryKey(site_id, tag_id);
        Gson gson = new Gson();
        return gson.toJson(siteTag);
    }

    //根据 site_id 获取site
    public String getSiteById(int site_id){
        Site site = siteMapper.selectByPrimaryKey(site_id);
        Gson gson = new Gson();
        return gson.toJson(site);
    }

    //根据 broad_kind_id 获取 broad_kind
    public String getBroadKindById(int broad_kind_id){
        BroadKind broadKind = broadKindMapper.selectByPrimaryKey(broad_kind_id);
        Gson gson = new Gson();
        return gson.toJson(broadKind);
    }

    //根据 kind_id 获取 kind
    public String getKindById(int kind_id){
        Kind kind = kindMapper.selectByPrimaryKey(kind_id);
        Gson gson = new Gson();
        return gson.toJson(kind);
    }


}
