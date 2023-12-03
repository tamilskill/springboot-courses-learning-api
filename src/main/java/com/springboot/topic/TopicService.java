package com.springboot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	public List<Topic> topics = Arrays.asList(
				new Topic("spring", "Spring Framework", "Spring Framework Description"),
				new Topic("java", "Core Java", "Core Java Description"),
				new Topic("javascript", "Javascript", "Javascript Framework Description")
		);

	public List<Topic> getAllTopics() {
		return topics;
	}
	
}
