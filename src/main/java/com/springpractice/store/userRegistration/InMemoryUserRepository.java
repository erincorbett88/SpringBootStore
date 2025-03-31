package com.springpractice.store.userRegistration;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryUserRepository implements UserRepository{
    private final Map<String, User> users = new HashMap<>();

    @Override
    public void save(User user) {
        System.out.println("User saved in memory: " + user );
        users.put(user.getEmail(), user);
    }

    @Override
    public User findByEmail(String email) {
        return users.get(email);
    }
}
