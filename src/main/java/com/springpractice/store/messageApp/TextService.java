package com.springpractice.store.messageApp;

import org.springframework.stereotype.Service;

@Service("text")
public class TextService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Text Message notification");
        System.out.println(message);
    }
}
