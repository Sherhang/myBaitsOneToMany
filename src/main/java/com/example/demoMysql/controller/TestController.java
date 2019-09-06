//TestController.java
package com.example.demoMysql.controller;


import com.example.demoMysql.dao.*;
import com.example.demoMysql.bean.*;
import com.example.demoMysql.service.DemoMysqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.lang.String;

import com.google.gson.Gson;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Autowired
    private DemoMysqlService demoMysqlService;

    @RequestMapping("/test")
    public String tset() {
        return demoMysqlService.test();
    }

    //查询接口

    @RequestMapping("/getTags")
    public String getTags() {
        List<Tag> ret = demoMysqlService.getTags();
        Gson gson = new Gson();
        String json = gson.toJson(ret);
        System.out.println(json);
        return json;
    }

    //分页查询, page_size=0则获取整张表
    @RequestMapping(path = "/getTagsByPage", method = RequestMethod.POST)
    public String getTagsByPage(@RequestParam int page_num, @RequestParam int page_size) {
        List<Tag> ret = demoMysqlService.getTagsByPage(page_num, page_size);
        Gson gson = new Gson();
        String json = gson.toJson(ret);
        System.out.println(json);
        return json;
    }


    @RequestMapping("/getSiteTags")
    public String getSiteTags() {
        List<SiteTag> ret = demoMysqlService.getSiteTags();
        Gson gson = new Gson();
        String json = gson.toJson(ret);
        System.out.println(json);
        return json;
    }

    @RequestMapping("/getSites")
    public String getSites() {
        List<Site> ret = demoMysqlService.getSites();
        Gson gson = new Gson();
        String json = gson.toJson(ret);
        System.out.println(json);
        return json;
    }

    @RequestMapping("/getBroadKinds")
    public String getBroadKinds() {
        List<BroadKind> ret = demoMysqlService.getBroadKinds();
        Gson gson = new Gson();
        String json = gson.toJson(ret);
        System.out.println(json);
        return json;
    }

    @RequestMapping("/getKinds")
    public String getKinds() {
        List<Kind> ret = demoMysqlService.getKinds();
        Gson gson = new Gson();
        String json = gson.toJson(ret);
        System.out.println(json);
        return json;
    }

    @RequestMapping(path = "/getTagById/{tag_id}", method = RequestMethod.GET)
    public String getTagById(@PathVariable long tag_id) {
        Tag tag = demoMysqlService.getTagById(tag_id);
        Gson gson = new Gson();
        return gson.toJson(tag);
    }

    @RequestMapping(path = "/getSiteTagById", method = RequestMethod.POST)
    public String getSiteTagById(@RequestParam int site_id, @RequestParam long tag_id) {
        SiteTag siteTag = demoMysqlService.getSiteTagById(site_id, tag_id);
        Gson gson = new Gson();
        return gson.toJson(siteTag);
    }

    @RequestMapping(path = "/getSiteById/{id}", method = RequestMethod.GET)
    public String getSiteById(@PathVariable int id) {
        Site site = demoMysqlService.getSiteById(id);
        Gson gson = new Gson();
        return gson.toJson(site);
    }

    @RequestMapping(path = "/getBroadKindById/{id}", method = RequestMethod.GET)
    public String getBroadKindById(@PathVariable int id) {
        BroadKind broadKind = demoMysqlService.getBroadKindById(id);
        Gson gson = new Gson();
        return gson.toJson(broadKind);
    }

    @RequestMapping(path = "/getKindById/{id}", method = RequestMethod.GET)
    public String getKindById(@PathVariable int id) {
        Kind kind = demoMysqlService.getKindById(id);
        Gson gson = new Gson();
        return gson.toJson(kind);
    }

    //由外键查询
    //由种类 id 查询 大类
    @RequestMapping(value = "/getBroadKindsByKindId/{id}", method = RequestMethod.GET)
    public String getBroadKindsByKindId(@PathVariable int id) {
        List<BroadKind> ret = demoMysqlService.getBroadKindsByKindId(id);
        Gson gson = new Gson();
        String json = gson.toJson(ret);
        System.out.println(json);
        return json;
    }

    //由 大类 id 查询 tag
    @RequestMapping(value = "/getTagsByBroadKindId/{id}", method = RequestMethod.GET)
    public String getTagsByBroadKindId(@PathVariable int id) {
        List<Tag> ret = demoMysqlService.getTagsByBroadKindId(id);
        Gson gson = new Gson();
        String json = gson.toJson(ret);
        System.out.println(json);
        return json;
    }

    //由 大类 id 查询 tags, 分页。目前数据不多，用上面的接口就够了。
    @RequestMapping(value = "/getTagsByBroadKindIdByPage", method = RequestMethod.POST)
    public String getTagsByBroadKindIdByPage(@RequestParam int id, @RequestParam int page_num, @RequestParam int page_size) {
        List<Tag> ret = demoMysqlService.getTagsByBroadKindIdByPage(id, page_num, page_size);
        Gson gson = new Gson();
        String json = gson.toJson(ret);
        System.out.println(json);
        return json;
    }

    //由 tag查询其子集site_tag。因为有相同tag_id对应不同平台
    @RequestMapping(value = "/getSiteTagsByTagId/{id}", method = RequestMethod.GET)
    public String getSiteTagsByTagId(@PathVariable long id) {
        List<SiteTag> ret = demoMysqlService.getSiteTagsByTagId(id);
        Gson gson = new Gson();
        String json = gson.toJson(ret);
        System.out.println(json);
        return json;
    }

    //由 site_id 查询site_tag表，获取站点下的所有表数据
    @RequestMapping(value = "/getSiteTagsBySiteId/{id}", method = RequestMethod.GET)
    public String getSiteTagsBySiteId(@PathVariable int id) {
        List<SiteTag> ret = demoMysqlService.getSiteTagsBySiteId(id);
        Gson gson = new Gson();
        String json = gson.toJson(ret);
        System.out.println(json);
        return json;
    }

    //---> 添加类接口
    @RequestMapping(value = "addKind", method = RequestMethod.POST)
    public boolean addKind(@RequestBody Kind kind) {
        return demoMysqlService.addKind(kind);
    }

    //---> 删除类接口
    @RequestMapping(value = "delKindById/{id}", method = RequestMethod.GET)
    public boolean delKindById(@PathVariable int id){
        return demoMysqlService.delKindById(id);
    }

    //---> 更新类接口
    @RequestMapping(value="updateKind", method = RequestMethod.POST)
    public boolean updateKind(@RequestBody Kind kind){
        return demoMysqlService.updateKind(kind);
    }
}

