package com.dmall.paymentservice.apis.assemblr;

import com.dmall.paymentservice.apis.dto.PaymentCreationRequest;
import com.dmall.paymentservice.apis.dto.PaymentResponse;
import com.dmall.paymentservice.application.PaymentFactory;
import com.dmall.paymentservice.domain.Payment;
import com.dmall.paymentservice.infrastructure.repositories.dataentity.PaymentDataEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PaymentAssembler {
    protected static final ModelMapper mapper = new ModelMapper();

    @Autowired
    private PaymentFactory paymentFactory;

    public Payment getPayment(PaymentCreationRequest request) {
        return this.paymentFactory.toDomainObject(request.getOrderId(), request.getMethod(), request.getAmount());
    }

    public List<PaymentResponse> toPaymentResponseList(List<PaymentDataEntity> paymentDataEntities) {
        return paymentDataEntities.stream()
            .map(entity -> mapper.map(entity, PaymentResponse.class))
            .collect(Collectors.toList());
    }
}
