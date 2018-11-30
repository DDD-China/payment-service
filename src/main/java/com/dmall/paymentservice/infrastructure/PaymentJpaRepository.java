package com.dmall.paymentservice.infrastructure;

import com.dmall.paymentservice.infrastructure.dataentity.PaymentDataEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentJpaRepository extends CrudRepository<PaymentDataEntity, Long> {
}
