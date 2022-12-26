package com.example.exam.controllers;

import com.example.exam.dto.InvoiceDTO;
import com.example.exam.dto.UserSubscriptionDTO;
import com.example.exam.entity.Invoice;
import com.example.exam.entity.UserSubscription;
import com.example.exam.service.BlockingService;
import com.example.exam.service.InvoiceService;
import com.example.exam.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.List;


@Controller
public class MainController {

    @Autowired
    private InvoiceService paymentService;

    @Autowired
    private BlockingService blockingService;

    @Autowired
    private SubscriptionService subscriptionService;


    /**
     * The user chooses the tariff, payment period (month, year), automatic/manual payment, enters bank card data
    */
    public UserSubscription createSubscription(UserSubscriptionDTO userSubscriptionInfo){
        return subscriptionService.createSubscription(userSubscriptionInfo);

    }

    /**
     For each user, depending on the selected payment period, on the corresponding day of the month/year, an invoice is generated according to the selected tariff
     With automatic payment, an attempt is made to debit the card through the payment service
     */
    public Invoice createInvoice (InvoiceDTO invoiceInfo){
        return paymentService.createInvoiceForSubscription(invoiceInfo);
    }

    public Invoice getInvoiceInfo(Integer invoiceId){
        return paymentService.getInvoiceInfo(invoiceId);
    }

}
