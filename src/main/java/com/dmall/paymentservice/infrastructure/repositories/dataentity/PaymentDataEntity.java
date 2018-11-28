package com.dmall.paymentservice.infrastructure.repositories.dataentity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Table(name = "payment")
public class PaymentDataEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_id", nullable = false)
    private Long orderId;

    @Column
    private String method;

    @Column(nullable = false)
    private BigDecimal amount;
}
