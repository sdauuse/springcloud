package com.miao.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author miaoyin
 * @date 2021/1/6 - 20:59
 * @commet:
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    //负载均衡,用了自己的负载均衡算法
    //@LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
