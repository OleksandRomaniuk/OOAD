package com.example.exam.service;

import com.example.exam.dto.InvoiceDTO;
import com.example.exam.dto.UserSubscriptionDTO;
import com.example.exam.entity.CardInfo;
import com.example.exam.entity.Invoice;
import com.example.exam.entity.UserSubscription;
import com.example.exam.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class InvoiceService {



    private static Integer MAX_NUMBER_UNPAID = 5;

    @Autowired
    private UserSubscriptionRepository userSubscriptionRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TariffRepository tariffRepository;

    @Autowired
    private CardInfoRepository cardInfoRepository;

    @Autowired
    private InvoiceRepository invoiceRepository;



    public Invoice createInvoiceForSubscription(InvoiceDTO invoiceInfo) {

        Invoice invoice = new Invoice();

        return invoiceRepository.save(invoice);
    }

    public Invoice getInvoiceInfo(Integer invoiceId) {

        return invoiceRepository.findById(invoiceId);
    }

}
