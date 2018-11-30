package com.dmall.paymentservice.representation;

import com.dmall.paymentservice.application.PaymentService;
import com.dmall.paymentservice.representation.dto.PaymentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
}
