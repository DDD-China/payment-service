package com.dmall.paymentservice.infrastructure.repositories;

import com.dmall.paymentservice.domain.Payment;
import com.dmall.paymentservice.infrastructure.repositories.dataentity.PaymentDataEntity;
import com.dmall.paymentservice.infrastructure.repositories.persistence.PaymentJpaPersistence;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PaymentRepository {

    protected static final ModelMapper mapper = new ModelMapper();

    @Autowired
    private PaymentJpaPersistence repository;

    public void save(Payment payment) {
        repository.save(mapper.map(payment, PaymentDataEntity.class));
    }

    public List<PaymentDataEntity> getPaymentsByOrderId(Long orderId) {
        return repository.findByOrderId(orderId);
    }
}
