package com.luo.mycloud.controller;

import com.luo.mycloud.service.PaymentFeignService;
import com.luo.springcloud.entities.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName OrderFeignController
 * @Description TODO
 * @Author l'l
 * @Date 2022/4/15 12:36
 * @Version 1.0
 */
@RestController
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;
    @GetMapping("/consumer/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        CommonResult  result = paymentFeignService.getPaymentById(id);
        return result;
    };
}
