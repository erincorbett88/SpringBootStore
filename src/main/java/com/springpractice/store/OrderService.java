package com.springpractice.store;

public class OrderService {
    private PaymentService paymentService; //instance variable

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.processPayment(10);

    }
}
