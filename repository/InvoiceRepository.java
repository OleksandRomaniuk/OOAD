package com.example.exam.repository;

import com.example.exam.entity.CardInfo;
import com.example.exam.entity.Invoice;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InvoiceRepository  extends MongoRepository<Invoice, String> {
     Invoice findById(Integer id);

}
