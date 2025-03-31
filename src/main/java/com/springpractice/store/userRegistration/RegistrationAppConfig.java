package com.springpractice.store.userRegistration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class RegistrationAppConfig {

    @Bean
    public InMemoryUserRepository userRepository() {
        return new InMemoryUserRepository();
    }

    @Bean
    @Lazy
    public EmailNotificationService notificationService() {
        System.out.println("Creating EmailNotificationService bean");
        return new EmailNotificationService();
    }

}
