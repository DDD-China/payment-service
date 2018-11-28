package com.dmall.paymentservice.apis.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PaymentResponse {
    private Long id;
    private Long orderId;
    private String method;
    private BigDecimal amount;
}
