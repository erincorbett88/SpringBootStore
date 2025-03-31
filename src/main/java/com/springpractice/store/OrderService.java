package com.springpractice.store;

import org.springframework.beans.factory.annotation.Qualifier;

//@Service
public class OrderService {

    private final PaymentService paymentService; //instance variable

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.processPayment(10);
    }

}
