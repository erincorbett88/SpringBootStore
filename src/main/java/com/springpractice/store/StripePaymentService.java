package com.springpractice.store;

import java.sql.SQLOutput;

public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("STRIPE");
        System.out.println("Payment processed for " + amount);
    }
}
