package com.example;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
	List<Tutorial> findByIsPublished(boolean isPublished);
	List<Tutorial> findByTitleContaining(String title);

}
