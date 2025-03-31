package com.springpractice.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//means "source of bean definitions"
public class AppConfig {
    @Value("${payment-gateway}")
    private String paymentGateway;

    //name it what you're going to name the bean
    //should be a noun
    @Bean
    //says that this method is a Bean producer
    public PaymentService stripe() {
        return new StripePaymentService();
    }
    //full control over bean creation

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
