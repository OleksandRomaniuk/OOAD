package com.example.exam.service;

import com.example.exam.dto.InvoiceDTO;
import com.example.exam.dto.UserSubscriptionDTO;
import com.example.exam.entity.Invoice;
import com.example.exam.entity.UserSubscription;
import com.example.exam.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class BlockingService {



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


    public List<Integer> checkUserAndBlock(List<Integer> userIds, Date startDate, Date endDate) {

        List<Integer> blockedUsers = new ArrayList<>();

        return blockedUsers;
    }



}
