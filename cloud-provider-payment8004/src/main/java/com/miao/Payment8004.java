package com.miao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author miaoyin
 * @date 2021/3/5 - 12:20
 * @commet:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment8004 {
    public static void main(String[] args) {
        SpringApplication.run(Payment8004.class, args);
    }
}
