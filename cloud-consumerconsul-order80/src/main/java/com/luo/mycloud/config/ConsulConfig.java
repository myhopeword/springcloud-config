package com.luo.mycloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ConsulConfig
 * @Description TODO
 * @Author l'l
 * @Date 2022/4/14 16:14
 * @Version 1.0
 */
@Configuration
public class ConsulConfig {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
