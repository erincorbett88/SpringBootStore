package com.springpractice.store;

import com.springpractice.store.entitites.Address;
import com.springpractice.store.entitites.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
//        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);

        var user = User.builder().name("John Doe").email("jdoe@gmail.com").password("password123").build();

        var address = Address.builder()
                .street("123 Main St")
                .city("Springfield")
                .state("IL")
                .zipCode("62701")
                .build();

        user.addAddress(address);
        System.out.println(user);

    }
}
