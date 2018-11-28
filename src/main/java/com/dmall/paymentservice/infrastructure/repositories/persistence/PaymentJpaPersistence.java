package com.dmall.paymentservice.infrastructure.repositories.persistence;

import com.dmall.paymentservice.apis.dto.PaymentResponse;
import com.dmall.paymentservice.infrastructure.repositories.dataentity.PaymentDataEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PaymentJpaPersistence extends CrudRepository<PaymentDataEntity, Long> {
    List<PaymentDataEntity> findByOrderId(Long orderId);
}
