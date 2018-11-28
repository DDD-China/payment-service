package com.dmall.paymentservice.domain;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Payment {
    private Long orderId;
    private String method;
    private BigDecimal amount;
}
