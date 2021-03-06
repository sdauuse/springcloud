package com.miao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author miaoyin
 * @date 2021/3/6 - 16:11
 * @commet:
 */
@SpringBootApplication
@EnableFeignClients
//开启服务熔断和降级兜底方法，要需要配置yaml
@EnableHystrix

public class OrderHystrixMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain80.class, args);
    }
}
