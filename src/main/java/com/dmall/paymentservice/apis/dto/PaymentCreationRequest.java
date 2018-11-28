package com.dmall.paymentservice.apis.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class PaymentCreationRequest {
    private Long orderId;
    private String method;
    private BigDecimal amount;
}
