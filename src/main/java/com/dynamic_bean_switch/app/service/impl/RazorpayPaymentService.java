package com.dynamic_bean_switch.app.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import com.dynamic_bean_switch.app.service.PaymentService;

@Service("razorpay")
@Slf4j
public class RazorpayPaymentService implements PaymentService {

    public RazorpayPaymentService() {
        log.info("RazorpayPaymentService initialized!");
        log.info("-------------------------------------------");
    }

    @Override
    public String pay(String amount, String mode, String sender, String receiver) {
        log.info("Processing payment with Razorpay: amount={}, mode={}, sender={}, receiver={}", amount, mode, sender, receiver);
        return "paid with razorpay " + amount + " from " + sender + " to " + receiver + " using mode " + mode;
    }
}
