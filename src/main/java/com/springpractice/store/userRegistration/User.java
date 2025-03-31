package com.springpractice.store.userRegistration;

public class User {
    private int id;
    private String name;
    private String email;
    private String password;

    public User(int id, String email, String name, String password) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;

    }

    public String getEmail() {
        return email;
    }


    public String getName() {
        return name;
    }
}
