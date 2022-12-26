package com.example.exam.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 *A class that contains information about payment subscription data
 */
@Entity
@Data
public class UserSubscription {
    @Id
    Integer id;


    Integer userId;

    Integer tariffId;


    Date startDate;


    Date endDate;


    boolean automatePayment;


    Integer cardInfoId;


    List<Invoice> payments;

}
