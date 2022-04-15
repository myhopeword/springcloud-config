package com.luo.mycloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName ConsulMainorder80
 * @Description TODO
 * @Author l'l
 * @Date 2022/4/14 16:13
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulMainorder80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsulMainorder80.class,args);
    }

}
