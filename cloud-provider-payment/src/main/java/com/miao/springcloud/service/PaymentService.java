package com.miao.springcloud.service;

import com.miao.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @author miaoyin
 * @date 2021/1/6 - 19:30
 * @commet:
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
