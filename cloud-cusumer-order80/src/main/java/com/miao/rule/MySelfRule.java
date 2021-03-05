package com.miao.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author miaoyin
 * @date 2021/3/5 - 16:23
 * @commet:
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new RandomRule();//把负载均衡的算法定义为随机，还要修改启动类
    }

}
