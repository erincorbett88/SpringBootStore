package com.springpractice.store.userRegistration;

import org.springframework.beans.factory.annotation.Value;

public class EmailNotificationService implements NotificationService{
    @Value("${mail-server.host}")
    private String host;

    @Value("${mail-server.port}")
    private int port;

    @Override
    public void send(String message, String email) {
        System.out.println("Email message: " + message);
        System.out.println("Sent to " + email + "at host " + host + " at port " + port);
    }

}
