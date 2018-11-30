package com.dmall.paymentservice.infrastructure.dataentity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "payment")
public class PaymentDataEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "order_id", nullable = false)
    Long orderId;

    @Column(nullable = false)
    BigDecimal amount;

    @Column()
    String method;

}
