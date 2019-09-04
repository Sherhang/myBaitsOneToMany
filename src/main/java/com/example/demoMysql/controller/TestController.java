//TestController.java
package com.example.demoMysql.controller;


import com.example.demoMysql.dao.TagMapper;
import com.example.demoMysql.service.DemoMysqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod; // RequestMethod.GET
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PathVariable; // @PathVariable

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

    @RequestMapping(path = "/getInfoById/{tag_id}", method = RequestMethod.GET)
    public String getInfoById(@PathVariable long tag_id) {
        return demoMysqlService.getInfoById(tag_id);
    }
}

