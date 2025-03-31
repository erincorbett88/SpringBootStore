package com.springpractice.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//means "source of bean definitions"
public class AppConfig {
    @Value("${payment-gateway}")
    private String paymentGateway;

    @Bean
    //this names the bean "stripe"
    public PaymentService stripe() {
        return new StripePaymentService();
    }

    public PaymentService paypal() {
        return new PaypalPaymentService();
    }

    @Bean
    public OrderService orderService() {
        if (paymentGateway.equals("stripe")) {
            return new OrderService(stripe());
        }
        return new OrderService(paypal());
    }
}
