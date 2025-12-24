package com.dynamic_bean_switch.app.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dynamic_bean_switch.app.dto.PaymentRequest;
import com.dynamic_bean_switch.app.service.PaymentService;

@RestController
@RequestMapping("/api/payment/v2")
public class PaymentControllerV2 {

    private final Map<String, PaymentService> paymentServicesMap;

    public PaymentControllerV2(Map<String, PaymentService> paymentServicesMap) {
        this.paymentServicesMap = paymentServicesMap;
    }

    @PostMapping("/pay/v2")
    public String pay(@RequestBody PaymentRequest paymentRequest) {
        String paymentType = paymentRequest.getPaymentType().toLowerCase();

        System.out.println("availabel service: " + paymentServicesMap.get(paymentType));
        PaymentService service = paymentServicesMap.get(paymentType);

        if (service == null) {
            throw new IllegalArgumentException("Unsupported payment mode: " + paymentType);
        }
        return service.pay(
                paymentRequest.getAmount(),
                paymentType,
                paymentRequest.getSender(),
                paymentRequest.getReceiver()
        );

    }
}
