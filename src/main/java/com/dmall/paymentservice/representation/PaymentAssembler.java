package com.dmall.paymentservice.representation;

import com.dmall.paymentservice.infrastructure.dataentity.PaymentDataEntity;
import com.dmall.paymentservice.representation.dto.PaymentResponse;
import org.modelmapper.ModelMapper;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class PaymentAssembler {
    private static ModelMapper mapper = new ModelMapper();

    public static List<PaymentResponse> toResponseList(List<PaymentDataEntity>  list){
        return list.stream().map(entity -> mapper.map(entity,PaymentResponse.class)).collect(toList());
    }
}
