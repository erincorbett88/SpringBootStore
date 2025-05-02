package com.springpractice.store;

import com.springpractice.store.entitites.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
//        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);

        var user = new User(1L, "John Doe", "john.doe@gmail.com", "password123");

        User.builder().name("John Doe").email("jdoe@gmail.com").password("password123").build();

        user.setName("John Doe");
        user.setEmail("john.doe@gmail.com");
        user.setPassword("password123");
    }
}
