package com.dmall.paymentservice.contracttest;

import com.dmall.paymentservice.application.PaymentService;
import com.dmall.paymentservice.representation.PaymentController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

import static org.mockito.Mockito.mock;

public class PaymentBase {
    @Before
    public void setUp() {
        PaymentService paymentService = mock(PaymentService.class);
        RestAssuredMockMvc.standaloneSetup(new PaymentController(paymentService));
    }
}