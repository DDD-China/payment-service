package com.dmall.paymentservice.representation.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PaymentResponse {
    Long id;
    Long orderId;
    BigDecimal amount;
    String method;
}
