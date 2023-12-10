package com.springboot.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class courseService {
	
	@Autowired
	private CourseRespository courseRespository;
	
	public List<Course> getAllCourses(String topicId) {
		//return topics;
		List<Course> topics = new ArrayList<>();
		courseRespository.findByTopicId(topicId).forEach(topics::add);
		return topics;
	}
	
	public Course getCourse(String id) {
		// find topic and return it 
		return courseRespository.findById(id).orElse(null);
	}
	
	public void addCourse(Course course) {
		courseRespository.save(course);
	}
	
	public void updateCourse(String id, Course topic) {
		courseRespository.save(topic);
	}
	
	public void deleteCourse(String id) {
		courseRespository.deleteById(id);
	}
	
}
