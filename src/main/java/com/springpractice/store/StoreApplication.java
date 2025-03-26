package com.springpractice.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        //run method returns application context, which is our spring container
        var orderService = context.getBean(OrderService.class);
        orderService.placeOrder();
    }
    //practice line

}
