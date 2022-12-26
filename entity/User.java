package com.example.exam.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

/**
 * Simple User class
 */
@Entity
@Data
public class User {
    @Id
    Integer id;
    String email;

    boolean blocked;

    List<UserSubscription> subscriptions;


}
