package com.dmall.paymentservice.contracttest;

import com.dmall.paymentservice.apis.PaymentApi;
import com.dmall.paymentservice.apis.assemblr.PaymentAssembler;
import com.dmall.paymentservice.application.PaymentService;
import com.dmall.paymentservice.repositories.dataentity.PaymentDataEntity;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PaymentBase {
    @Before
    public void setUp() {
        final PaymentService paymentService = mock(PaymentService.class);

        List<PaymentDataEntity> paymentList = Collections.singletonList(
            PaymentDataEntity.builder()
                .id(1L)
                .amount(BigDecimal.valueOf(123L))
                .method("mobile")
                .orderId(1L)
                .build()
        );
        when(paymentService.getPaymentsByOrderId(anyLong())).thenReturn(paymentList);
        RestAssuredMockMvc.standaloneSetup(new PaymentApi(paymentService, new PaymentAssembler()));
    }
}
