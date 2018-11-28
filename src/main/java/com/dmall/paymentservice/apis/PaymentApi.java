package com.dmall.paymentservice.apis;

import com.dmall.paymentservice.apis.assemblr.PaymentAssembler;
import com.dmall.paymentservice.apis.dto.PaymentCreationRequest;
import com.dmall.paymentservice.application.PaymentFactory;
import com.dmall.paymentservice.application.PaymentService;
import com.dmall.paymentservice.domain.Payment;
import com.dmall.paymentservice.apis.dto.PaymentResponse;
import com.dmall.paymentservice.infrastructure.repositories.dataentity.PaymentDataEntity;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentApi {
    @Autowired
    private PaymentService paymentService;

    @Autowired
    private PaymentAssembler paymentAssembler;

    @ApiOperation("Add payment")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createPayment(PaymentCreationRequest request) {
        Payment payment = paymentAssembler.getPayment(request);
        paymentService.createPayment(payment);
    }

    @ApiOperation("Get payment by order id")
    @GetMapping
    public List<PaymentResponse> getPaymentsByOrderId(@RequestParam("orderId") final Long orderId) {
        List<PaymentDataEntity> paymentDataEntities = paymentService.getPaymentsByOrderId(orderId);
        return paymentAssembler.toPaymentResponseList(paymentDataEntities);
    }
}
