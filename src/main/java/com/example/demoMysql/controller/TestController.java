//TestController.java
package com.example.demoMysql.controller;


import com.example.demoMysql.dao.TagMapper;
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

    @RequestMapping("/getTags")
    public String getTags() {
        return demoMysqlService.getTags();
    }

    @RequestMapping("/getSiteTags")
    public String getSiteTags() {
        return demoMysqlService.getSiteTags();
    }

    @RequestMapping("/getSites")
    public String getSites() {
        return demoMysqlService.getSites();
    }

    @RequestMapping("/getBroadKinds")
    public String getBroadKinds() {
        return demoMysqlService.getBroadKinds();
    }

    @RequestMapping("/getKinds")
    public String getKinds() {
        return demoMysqlService.getKinds();
    }

    @RequestMapping(path = "/getTagById/{tag_id}", method = RequestMethod.GET)
    public String getTagById(@PathVariable long tag_id) {
        return demoMysqlService.getTagById(tag_id);
    }

    @RequestMapping(path = "/getSiteTagById", method = RequestMethod.POST)
    public String getSiteTagById(@RequestParam int site_id, @RequestParam long tag_id) {
        return demoMysqlService.getSiteTagById(site_id, tag_id);
    }

    @RequestMapping(path = "/getSiteById/{id}", method = RequestMethod.GET)
    public String getSiteById(@PathVariable int id) {
        return demoMysqlService.getSiteById(id);
    }

    @RequestMapping(path = "/getBroadKindById/{id}", method = RequestMethod.GET)
    public String getBroadKindById(@PathVariable int id) {
        return demoMysqlService.getBroadKindById(id);
    }

    @RequestMapping(path = "/getKindById/{id}", method = RequestMethod.GET)
    public String getKindById(@PathVariable int id) {
        return demoMysqlService.getKindById(id);
    }

}

