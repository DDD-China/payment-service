package com.dmall.paymentservice.representation.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PaymentRequest {
    String orderId;
    BigDecimal amount;
    String method;
}
