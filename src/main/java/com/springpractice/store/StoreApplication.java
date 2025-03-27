package com.springpractice.store;

import com.springpractice.store.messageApp.NotificationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

//        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        //run method returns application context, which is our spring container
//        var orderService = context.getBean(OrderService.class);
//        orderService.placeOrder();

        //practice line

        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var notificationService = context.getBean(NotificationService.class);
        notificationService.sendNotification("keep the change ya filthy animal");

    }
}
