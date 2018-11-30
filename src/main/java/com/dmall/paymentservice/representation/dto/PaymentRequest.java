package com.dmall.paymentservice.representation.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PaymentRequest {
    Long orderId;
    BigDecimal amount;
    String method;
}
