package com.springpractice.store.userRegistration;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final NotificationService notificationService;
    private final UserRepository userRepository;

    public UserService(NotificationService notificationService, UserRepository userRepository) {
        this.notificationService = notificationService;
        this.userRepository=userRepository;

    }

    public void registerUser(User user) {
        if (userRepository.findByEmail(user.getEmail()) != null) {
            throw new IllegalArgumentException("User with this email already exists");
        }
        userRepository.save(user);
        notificationService.send("Welcome "+user.getName()+" to our store", user.getEmail());
    }
}
