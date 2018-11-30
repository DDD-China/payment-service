package com.dmall.paymentservice.application;

import com.dmall.paymentservice.domain.Payment;
import com.dmall.paymentservice.infrastructure.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public void createPayment(Long orderId, BigDecimal amount, String method) {
        Payment payment = new Payment();
        payment.setAmount(amount);
        payment.setMethod(method);
        payment.setOrderId(orderId);
        paymentRepository.save(payment);
    }
}
