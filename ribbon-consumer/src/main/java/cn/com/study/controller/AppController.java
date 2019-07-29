package cn.com.study.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

import cn.com.study.service.AppService;

@RestController
public class AppController {

    private final static Logger LOG = LoggerFactory.getLogger(AppController.class);
    
    @Autowired
    private AppService appService;
    
    @RequestMapping(value = "/caculate")
    public JSONObject isRunning(HttpServletRequest request, HttpServletResponse response) {
        LOG.info("to caculate...");
        return appService.caculate(1, 2);
    }
}
