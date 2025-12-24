package com.dynamic_bean_switch.app.service.impl;

import org.springframework.stereotype.Service;

import com.dynamic_bean_switch.app.service.PaymentService;

import lombok.extern.slf4j.Slf4j;

@Service("paypal")
@Slf4j
public class PaypalPaymentService implements PaymentService {

    public PaypalPaymentService() {
        log.info("PaypalPaymentService initialized!");
        log.info("-------------------------------------------");
    }

    @Override
    public String pay(String amount, String mode, String sender, String receiver) {
        log.info("Processing payment with PayPal: amount={}, mode={}, sender={}, receiver={}", amount, mode, sender, receiver);
        return "paid with paypal " + amount + " from " + sender + " to " + receiver + " using mode " + mode;
    }

}
