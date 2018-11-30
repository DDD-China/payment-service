package com.dmall.paymentservice.domain;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "order-service", url = "${order-service-url}")
public interface OrderService {
    @PatchMapping(value = "/orders/{orderId}", headers = "Accept:application/json;charset=UTF-8")
    void updateOrderForPayment(@PathVariable Long orderId, @RequestBody OrderPayStatus orderPayStatus);
}
