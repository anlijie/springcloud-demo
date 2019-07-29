package cn.com.study.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import cn.com.study.config.ServiceRoot;

public class BaseService {

    @Autowired
    protected RestTemplate restTemplate;
    
    @Autowired
    protected ServiceRoot serviceRoot;
    
    protected final Logger log = LoggerFactory.getLogger(this.getClass());
}
