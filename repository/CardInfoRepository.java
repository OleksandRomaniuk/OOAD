package com.example.exam.repository;

import com.example.exam.entity.CardInfo;
import com.example.exam.entity.Tariff;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CardInfoRepository  extends MongoRepository<CardInfo, String> {

    CardInfo findById(Integer id);

}
