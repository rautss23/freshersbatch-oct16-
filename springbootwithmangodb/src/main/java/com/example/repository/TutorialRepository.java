package com.example.repository;

import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.model.Tutorial;

public interface TutorialRepository extends MongoRepository<Tutorial, String>{

	List<Tutorial> findByTitleContaining(String title);
//	List<Tutorial> findByTitleContaining(String title);
//	List<Tutorial> findByIsPublished(boolean isPublished);

	List<Tutorial> findByIsPublished(boolean b);

}
