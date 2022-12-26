package com.example.exam.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


/**
 A class containing information about a specific user's card
 */
@Entity
@Data
public class CardInfo {
    @Id
    Integer id;

    Integer userId;
    Integer number;
    Integer code;
}
