package cn.com.study.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ApplicationController {
    
    private final static Logger LOG = LoggerFactory.getLogger(ApplicationController.class);

    @Value("${from:NONE}")
    private String from;
    
    @RequestMapping(value = "/from")
    public String from() {
        LOG.info("property from config-server is: {}", from);
        
        return this.from;
    }
}
