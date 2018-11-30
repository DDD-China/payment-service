package com.dmall.paymentservice.representation;

import com.dmall.paymentservice.application.PaymentService;
import com.dmall.paymentservice.infrastructure.dataentity.PaymentDataEntity;
import com.dmall.paymentservice.representation.dto.PaymentRequest;
import com.dmall.paymentservice.representation.dto.PaymentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createPayment(@RequestBody PaymentRequest request) {
        paymentService.createPayment(request.getOrderId(), request.getAmount(), request.getMethod());
    }

    @GetMapping
    public List<PaymentResponse> getPaymentsByOrderId(@RequestParam String  orderId){
        List<PaymentDataEntity> list = paymentService.getPaymentsByOrderId(orderId);
        return PaymentAssembler.toResponseList(list);
    }
}
