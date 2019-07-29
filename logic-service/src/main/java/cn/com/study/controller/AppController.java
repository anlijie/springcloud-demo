package cn.com.study.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.math.NumberUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

@RestController
public class AppController {

    private final static Logger LOG = LoggerFactory.getLogger(AppController.class);
    
    @Autowired
    private Registration registration;
    
    @RequestMapping(value = "/caculate")
    public JSONObject caculate(HttpServletRequest request, HttpServletResponse response) {
        
        LOG.info("/caculate, service_id: {}", registration.getServiceId());
        
        int paramA = NumberUtils.toInt(request.getParameter("paramA"));
        int paramB = NumberUtils.toInt(request.getParameter("paramB"));
        
        JSONObject result = new JSONObject().fluentPut("result", paramA+paramB);
        LOG.info("caculate result is : {}", result);
        
        return result;
    }
}
