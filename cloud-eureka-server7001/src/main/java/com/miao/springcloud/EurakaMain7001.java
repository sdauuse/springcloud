package com.miao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author miaoyin
 * @date 2021/1/6 - 22:01
 * @commet:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurakaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurakaMain7001.class, args);
    }
}
