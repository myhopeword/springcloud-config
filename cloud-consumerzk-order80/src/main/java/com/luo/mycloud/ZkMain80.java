package com.luo.mycloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName ZkMain80
 * @Description TODO
 * @Author l'l
 * @Date 2022/4/14 13:34
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZkMain80 {
    public static void main(String[] args) {
        SpringApplication.run(ZkMain80.class,args);
    }
}
