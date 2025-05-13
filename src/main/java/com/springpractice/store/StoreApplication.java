package com.springpractice.store;

import com.springpractice.store.entitites.Address;
import com.springpractice.store.entitites.Profile;
import com.springpractice.store.entitites.Tag;
import com.springpractice.store.entitites.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
//        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);

        var user = User.builder().name("John Doe").email("jdoe@gmail.com").password("password123").build();

        var profile = Profile.builder()
                .bio("Software Engineer")
                .build();
        profile.setUser(user);
        user.setProfile(profile);
        System.out.println(user);


    }
}
