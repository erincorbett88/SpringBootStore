package com.springpractice.store.entitites;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "profiles")
public class Profile {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bio")
    private String bio;

    @Column(name = "phone")
    private String phoneNumber;

    @Column(name = "dob")
    private String dateOfBirth;

    @Column(name = "points")
    private int loyaltyPoints;
}
