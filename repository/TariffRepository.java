package com.example.exam.repository;

import com.example.exam.entity.CardInfo;
import com.example.exam.entity.Tariff;
import com.example.exam.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TariffRepository  extends MongoRepository<Tariff, String> {

    Tariff findById(Integer id);

}
