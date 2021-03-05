package com.miao.controller;


import com.miao.springcloud.entities.CommonResult;
import com.miao.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author miaoyin
 * @date 2021/3/5 - 13:38
 * @commet:
 */
@RestController
@Slf4j
public class OrderZkController {
    public static final String INVOME_URL = "http://cloud-provider-payment";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk")
    public String payment (){
        //远程服务调用
        String result = restTemplate.getForObject(INVOME_URL+"/payment/zk",String.class);
        return result;
    }
}
