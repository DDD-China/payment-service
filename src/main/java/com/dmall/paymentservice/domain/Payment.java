package com.dmall.paymentservice.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Payment {
    Long id;
    Long orderId;
    BigDecimal amount;
    String method;
}
