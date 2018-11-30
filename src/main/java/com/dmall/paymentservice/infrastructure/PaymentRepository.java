package com.dmall.paymentservice.infrastructure;

import com.dmall.paymentservice.domain.Payment;
import com.dmall.paymentservice.infrastructure.dataentity.PaymentDataEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PaymentRepository {
    @Autowired
    private PaymentJpaRepository repository;

    protected final static ModelMapper mapper = new ModelMapper();

    public void save(Payment payment) {
        PaymentDataEntity paymentDataEntity = mapper.map(payment, PaymentDataEntity.class);
        repository.save(paymentDataEntity);
    }

    public List<PaymentDataEntity> getPaymentsByOrderId(String orderId) {
        return repository.findByOrderId(orderId);
    }
}
