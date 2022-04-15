package com.luo.mycloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName Zkcontroller
 * @Description TODO
 * @Author l'l
 * @Date 2022/4/14 13:40
 * @Version 1.0
 */
@RestController
@Slf4j
public class Zkcontroller {

    public static final String ZOOKEEPER_URL="http://cloud-provider-payment";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk")
    public String payment(){
        String result = restTemplate.getForObject(ZOOKEEPER_URL + "/payment/zk", String.class);
        return result;
    }
}
