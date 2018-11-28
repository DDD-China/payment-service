package com.dmall.paymentservice.repositories.persistence;


import com.dmall.paymentservice.repositories.dataentity.PaymentDataEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentJpaPersistence extends CrudRepository<PaymentDataEntity, Long> {
  List<PaymentDataEntity> findByOrderId(Long orderId);
}
