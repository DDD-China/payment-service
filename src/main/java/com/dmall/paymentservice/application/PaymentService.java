package com.dmall.paymentservice.application;

import com.dmall.paymentservice.domain.Payment;
import com.dmall.paymentservice.repositories.PaymentRepository;
import com.dmall.paymentservice.repositories.dataentity.PaymentDataEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public void createPayment(Payment payment) {
        paymentRepository.save(payment);
    }

    public List<PaymentDataEntity> getPaymentsByOrderId(Long orderId) {
        return paymentRepository.getPaymentsByOrderId(orderId);
    }
}
