package com.example.exam.dto;

import lombok.Data;

import java.util.Date;

/**
DTO containing the necessary information to create a payment subscription
 */
@Data
public class UserSubscriptionDTO {

    Integer userId;

    Integer tariffId;

    boolean automatePayment;

    Integer number;

    Integer code;

    Date date;
}
