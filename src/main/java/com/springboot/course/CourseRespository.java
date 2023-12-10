package com.springboot.course;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRespository extends JpaRepository<Course, String>{
	
	public List<Course>  findByTopicId(String topicID);
	
}
