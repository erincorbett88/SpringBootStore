package com.springpractice.store;

public class OrderService {
    public void placeOrder() {
        var paymentService = new PaymentService();
        paymentService.processPayment(10);

    }
}
