package com.dmall.paymentservice.repositories.dataentity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Builder
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
