package com.dmall.paymentservice.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderPaymentStatus {
    boolean paid;
}
