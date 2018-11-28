package com.dmall.paymentservice.application;

import com.dmall.paymentservice.domain.Payment;
import com.dmall.paymentservice.infrastructure.repositories.PaymentRepository;
import com.dmall.paymentservice.infrastructure.repositories.dataentity.PaymentDataEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
