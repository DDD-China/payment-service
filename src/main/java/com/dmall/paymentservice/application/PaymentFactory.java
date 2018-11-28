package com.dmall.paymentservice.application;

import com.dmall.paymentservice.domain.Payment;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class PaymentFactory {
    protected static final ModelMapper mapper = new ModelMapper();

    public Payment toDomainObject(Long orderId, String method, BigDecimal amount) {
        return Payment.builder()
            .orderId(orderId)
            .method(method)
            .amount(amount)
            .build();
    }
}
