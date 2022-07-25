package com.demo.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.example.model.User;

@Repository
public interface UserRepository extends MongoRepository<User,Long>{
	
}