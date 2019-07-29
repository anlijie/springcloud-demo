package cn.com.study;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Application {

    private final static Logger LOG = LoggerFactory.getLogger(Application.class);
    
    public static void main(String[] args) {
        LOG.info("spring cloud config-client application start to boot...");
        
        SpringApplication.run(Application.class, args);
        
        LOG.info("spring cloud config-client application is running...");
    }
}