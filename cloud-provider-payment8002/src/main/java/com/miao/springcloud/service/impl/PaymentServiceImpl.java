package com.miao.springcloud.service.impl;

import com.miao.springcloud.dao.PaymentDao;
import com.miao.springcloud.entities.Payment;
import com.miao.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author miaoyin
 * @date 2021/1/6 - 19:31
 * @commet:
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    public int create(Payment payment) {

        return paymentDao.create(payment);
    }

    public Payment getPaymentById(@Param("id") Long id) {
        return paymentDao.getPaymentById(id);
    }
}
