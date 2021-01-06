package com.miao.springcloud.controller;

import com.miao.springcloud.entities.CommomResult;
import com.miao.springcloud.entities.Payment;
import com.miao.springcloud.service.PaymentService;
import com.sun.xml.internal.fastinfoset.CommonResourceBundle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author miaoyin
 * @date 2021/1/6 - 19:34
 * @commet:
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommomResult create(Payment payment) {
        int result = paymentService.create(payment);
        log.info("******插入结果*****" + result);
        if (result > 0) {
            return new CommomResult(200, "插入数据库成功", result);
        } else {
            return new CommomResult(444, "插入数据库失败", null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommomResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("******插入结果" + payment);

        if (payment != null) {
            return new CommomResult(200, "查询成功", payment);
        } else {
            return new CommomResult(444, "没有对应记录,查询失败。 id=" + id, null);

        }
    }
}
