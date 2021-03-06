package com.miao.springcloud.controller;

import com.miao.springcloud.entities.CommonResult;
import com.miao.springcloud.entities.Payment;
import com.miao.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author miaoyin
 * @date 2021/3/6 - 13:27
 * @commet:
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymemtById(@PathVariable("id") Long id){

        return paymentFeignService.getPaymentById(id);
    }
}
