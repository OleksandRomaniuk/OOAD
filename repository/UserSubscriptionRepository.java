package com.example.exam.repository;


import com.example.exam.entity.UserSubscription;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSubscriptionRepository extends MongoRepository<UserSubscription, String> {

    UserSubscription findById(Integer id);

}
