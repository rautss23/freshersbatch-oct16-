package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User> findByUserName(String userName);
}
