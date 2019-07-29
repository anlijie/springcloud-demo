package cn.com.study;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Application {

    private final static Logger LOG = LoggerFactory.getLogger(Application.class);
    
    public static void main(String[] args) {
        LOG.info("spring cloud eureka-server application start to boot...");
        
        SpringApplication.run(Application.class, args);
        
        LOG.info("spring cloud eureka-server application is running...");
    }
}