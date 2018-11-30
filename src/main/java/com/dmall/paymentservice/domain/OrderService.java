package com.dmall.paymentservice.domain;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "order-service", url = "${order-service-url}")
public interface OrderService {
    @PatchMapping(value = "/orders/{orderId}", headers = {"Content-Type: application/json;charset=UTF-8"})
    public void updateOrderPaymentStatus(@PathVariable String orderId, OrderPaymentStatus orderPaymentStatus);
}
