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
    private ParentKindMapper parentKindMapper;

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
    //根据tag_id 获取 所有信息
    public String getInfoById(long tag_id){
        Tag tag = tagMapper.selectByPrimaryKey(tag_id);
        Gson gson = new Gson();
        return gson.toJson(tag);
    }




}
