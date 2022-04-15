package com.luo.mycloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ConsulController
 * @Description TODO
 * @Author l'l
 * @Date 2022/4/14 16:16
 * @Version 1.0
 */
@RestController
public class ConsulController {
    public static final String ZOOKEEPER_URL="http://consul-provider-payment";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/cl")
    public String payment(){
        String result = restTemplate.getForObject(ZOOKEEPER_URL + "/payment/consul", String.class);
        return result;
    }
}
