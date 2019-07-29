package cn.com.study;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class Application {

    private final static Logger LOG = LoggerFactory.getLogger(Application.class);
    
    public static void main(String[] args) {
        LOG.info("spring cloud config-server application start to boot...");
        
        SpringApplication.run(Application.class, args);
        
        LOG.info("spring cloud config-server application is running...");
    }
}
