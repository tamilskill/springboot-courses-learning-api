package com.springboot.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRespository topicRespository;
	
	public List<Topic> getAllTopics() {
		//return topics;
		List<Topic> topics = new ArrayList<>();
		topicRespository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id) {
		// find topic and return it 
		return topicRespository.findById(id).orElse(null);
	}
	
	public void addTopic(Topic topic) {
		topicRespository.save(topic);
	}
	
	public void updateTopic(String id, Topic topic) {
		topicRespository.save(topic);
	}
	
	public void deleteTopic(String id) {
		topicRespository.deleteById(id);
	}
	
}
