package com.luo.mycloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @ClassName ConsulController
 * @Description TODO
 * @Author l'l
 * @Date 2022/4/14 15:40
 * @Version 1.0
 */
@RestController
@Slf4j
public class ConsulController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/consul")
    public String paymentConsul(){
        return "com.luo.springcloud with consul: "+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
