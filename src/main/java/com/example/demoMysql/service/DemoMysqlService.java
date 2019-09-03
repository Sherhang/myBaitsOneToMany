//DemoMysqlService.java

package com.example.demoMysql.service;

import com.example.demoMysql.dao.*;
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

    void getTags(){

    }




}
