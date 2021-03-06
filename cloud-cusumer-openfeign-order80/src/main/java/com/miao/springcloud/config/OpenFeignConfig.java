package com.miao.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author miaoyin
 * @date 2021/3/6 - 14:01
 * @commet:
 */
//打开openfeign的日志功能，并设置yaml文件
@Configuration
public class OpenFeignConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}



