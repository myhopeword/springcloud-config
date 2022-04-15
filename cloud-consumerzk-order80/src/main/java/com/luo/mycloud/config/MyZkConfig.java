package com.luo.mycloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName MyZkConfig
 * @Description TODO
 * @Author l'l
 * @Date 2022/4/14 13:43
 * @Version 1.0
 */
@Configuration
public class MyZkConfig {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
