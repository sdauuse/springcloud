package com.miao.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author miaoyin
 * @date 2021/3/6 - 14:49
 * @commet:
 */
@Service
public class PaymentService {

    //成功
    public String paymentInfo_OK(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + "   paymentInfo_OK,id：  " + id + "\t" + "哈哈哈";
    }


    //失败
    //当调用方法失败时(即设置的3s内没有响应)，调用兜底方法
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")//5秒钟以内就是正常的业务逻辑)
    })

    public String paymentInfo_TimeOut(Integer id) {
        int timeNumber = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //int age = 10 / 0;

        return "线程池：" + Thread.currentThread().getName() + "   paymentInfo_TimeOut,id：  " + id + "\t" + "呜呜呜" + " 耗时(秒)" + timeNumber;
//        return "线程池：" + Thread.currentThread().getName() + "   paymentInfo_TimeOut,id：  " + id + "\t" + "呜呜呜" + " 耗时(秒)";
    }

    public String paymentInfo_TimeOutHandler(Integer id) {

        return "线程池：" + Thread.currentThread().getName() + "   paymentInfo_TimeOut,id：  " + id + "\t" + "哭哭";
    }
}
