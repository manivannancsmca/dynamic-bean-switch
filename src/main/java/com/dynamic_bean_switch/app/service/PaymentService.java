package com.dynamic_bean_switch.app.service;

public interface PaymentService {

    String pay(String amount,String mode,
               String sender, String receiver);
}
