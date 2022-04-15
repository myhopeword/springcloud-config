package com.luo.mycloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName ConsulMain8006
 * @Description TODO
 * @Author l'l
 * @Date 2022/4/14 15:38
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulMain8006 {
    public static void main(String[] args) {
        SpringApplication.run(ConsulMain8006.class,args);
    }
}
