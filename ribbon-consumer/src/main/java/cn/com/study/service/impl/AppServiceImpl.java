package cn.com.study.service.impl;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import cn.com.study.service.AppService;
import cn.com.study.service.BaseService;

@Service
public class AppServiceImpl extends BaseService implements AppService {

    @HystrixCommand(fallbackMethod = "addServiceFallback")
    @Override
    public JSONObject caculate(int paramA, int paramB) {
        log.info("caculate by: {} and {}", paramA, paramB);
        
        JSONObject result = restTemplate.getForEntity(
                serviceRoot.getLogic() + "/caculate?paramA=" + paramA + "&paramB=" + paramB, 
                JSONObject.class).getBody();
        
        log.info("caculate result is : {}", result);
        
        return result;
    }
    
    public JSONObject addServiceFallback(int paramA, int paramB) {
        return new JSONObject().fluentPut("result", "error");
    }
}
