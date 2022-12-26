package com.example.exam.dto;

import lombok.Data;

import java.util.Date;

    /**
    A DTO containing the necessary information to create an invoice for a specific payment subscription
     */
@Data
public class InvoiceDTO {

    Date invoiceDate;

    Integer userSubscriptionId;

    Integer price;

}
