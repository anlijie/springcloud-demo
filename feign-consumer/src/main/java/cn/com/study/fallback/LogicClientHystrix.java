package cn.com.study.fallback;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSONObject;

import cn.com.study.service.LogicClient;

@Component
public class LogicClientHystrix implements LogicClient {
    
    @Override
    public JSONObject caculate(@RequestParam(value = "paramA") Integer paramA, 
            @RequestParam(value = "paramB") Integer paramB) {
        return new JSONObject().fluentPut("result", "error");
    }
}
