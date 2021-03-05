package com.miao.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author miaoyin
 * @date 2021/3/5 - 12:25
 * @commet:
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/payment/zk")
    public String paymentZk() {
        return "spring boot with zookeeper server port " + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
