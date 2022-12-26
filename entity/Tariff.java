package com.example.exam.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 *Class containing information about the tariff
 */
@Entity
@Data
public class Tariff {

    @Id
    Integer id;

    String name;
    Integer price;

}
