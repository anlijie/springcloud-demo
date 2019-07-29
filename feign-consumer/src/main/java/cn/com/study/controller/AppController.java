package cn.com.study.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

import cn.com.study.service.LogicClient;

@RestController
public class AppController {

    private final static Logger LOG = LoggerFactory.getLogger(AppController.class);
    
    @Autowired
    private LogicClient logicClient;
    
    @RequestMapping(value = "/caculate")
    public JSONObject caculate() {
        LOG.info("feign request...");
        
        JSONObject json = logicClient.caculate(10, 20);
        LOG.info("caculate result is : {}", json);
        
        return json;
    }
}