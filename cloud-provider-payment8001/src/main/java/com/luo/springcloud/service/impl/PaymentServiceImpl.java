package com.luo.springcloud.service.impl;


import com.luo.springcloud.dao.PaymentDao;
import com.luo.springcloud.entities.Payment;
import com.luo.springcloud.service.PaymentService;


import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * @ClassName PaymentServiceImpl
 * @Description TODO
 * @Author l'l
 * @Date 2022/4/3 22:26
 * @Version 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
