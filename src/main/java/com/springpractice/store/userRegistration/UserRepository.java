package com.springpractice.store.userRegistration;

public interface UserRepository {
    void save(User user);

    User findByEmail(String email);

}
