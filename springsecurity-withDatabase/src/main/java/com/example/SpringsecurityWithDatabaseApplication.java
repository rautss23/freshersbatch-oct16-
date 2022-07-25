package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.repository.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringsecurityWithDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecurityWithDatabaseApplication.class, args);
	}

}
