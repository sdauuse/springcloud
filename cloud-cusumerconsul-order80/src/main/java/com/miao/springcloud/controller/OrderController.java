package com.miao.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author miaoyin
 * @date 2021/3/5 - 14:38
 * @commet:
 */
@Slf4j
@RestController
public class OrderController {
    public static final String INVOME_URL = "http://consul-provider-payment";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String payment (){
        //远程服务调用
        String result = restTemplate.getForObject(INVOME_URL+"/payment/consul",String.class);
        return result;
    }
}
