package com.springpractice.store;

import com.springpractice.store.userRegistration.User;
import com.springpractice.store.userRegistration.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);

        var userService = context.getBean("userService", UserService.class);
        userService.registerUser(new User(654123, "erin.corbett@gmail.com", "Erin Corbett", "asdflkj12"));
//
//        var orderService = context.getBean("orderService", OrderService.class);
//        var orderService2 = context.getBean("orderService", OrderService.class);
//        orderService.placeOrder();
//        orderService2.placeOrder();

    }
}
