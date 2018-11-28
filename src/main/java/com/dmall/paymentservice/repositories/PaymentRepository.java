package com.dmall.paymentservice.repositories;

import com.dmall.paymentservice.domain.Payment;
import com.dmall.paymentservice.repositories.dataentity.PaymentDataEntity;
import com.dmall.paymentservice.repositories.persistence.PaymentJpaPersistence;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
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
