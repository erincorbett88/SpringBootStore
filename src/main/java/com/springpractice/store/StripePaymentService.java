package com.springpractice.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;

@Primary
@Service("stripe")
public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("STRIPE");
        System.out.println("Payment processed for " + amount);
    }
}
