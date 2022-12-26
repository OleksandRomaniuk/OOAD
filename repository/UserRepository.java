package com.example.exam.repository;

import com.example.exam.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface UserRepository extends MongoRepository<User, String> {

    User findById(Integer id);

}
