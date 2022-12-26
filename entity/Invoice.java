package com.example.exam.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;



/**
  * A class that contains information about payment for a specific subscription
 */
@Entity
@Data
public class Invoice {
  @Id
  Integer id;

  Date invoiceDate;

  Date invoicePaymentDate;

  Integer userSubscriptionId;


  boolean automaticPayment;

  boolean payed;

  Integer paymentAttempts;

  Integer price;

}
