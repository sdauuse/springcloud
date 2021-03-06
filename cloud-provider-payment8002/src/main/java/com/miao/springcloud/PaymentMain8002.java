package com.miao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author miaoyin
 * @date 2021/1/6 - 18:41
 * @commet:
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8002 {
    public static void main(String[] args) {
        //SpringApplication.run(PaymentMain8001.class,args);
        SpringApplication.run(PaymentMain8002.class, args);
    }
}