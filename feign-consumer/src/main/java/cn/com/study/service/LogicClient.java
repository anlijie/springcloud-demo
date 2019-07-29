package cn.com.study.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSONObject;

import cn.com.study.fallback.LogicClientHystrix;

@FeignClient(value = "logic-service", fallback = LogicClientHystrix.class)
public interface LogicClient {

    @RequestMapping(value = "/caculate")
    JSONObject caculate(@RequestParam(value = "paramA") Integer paramA, 
            @RequestParam(value = "paramB") Integer paramB);
}
