package com.dynamic_bean_switch.app.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import com.dynamic_bean_switch.app.service.PaymentService;

@Service("stripe")
@Slf4j
public class StripePaymentService implements PaymentService {

    public StripePaymentService() {
        log.info("StripePaymentService initialized!");
        log.info("-------------------------------------------");
    }

    @Override
    public String pay(String amount, String mode, String sender, String receiver) {
        // Simulate payment processing logic
        log.info("Processing payment with Stripe: amount={}, mode={}, sender={}, receiver={}", amount, mode, sender, receiver);
        return "paid with stripe " + amount + " from " + sender + " to " + receiver + " using mode " + mode;
    }
}
