package com.springpractice.store;

public class PaypalPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("PAYPAL");
        System.out.println("Payment processed for " + amount);
    }
}
