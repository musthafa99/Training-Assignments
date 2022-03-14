package com.cg.ExampleTopics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Topics {
	
	private List<TopicDeatils>topics=new ArrayList<>(Arrays.asList(
			new TopicDeatils("Spring","Spring Framework","Spring Framework Description"),
			new TopicDeatils("Java","Java Framework","Java Framework Description"),
			new TopicDeatils("Spring Boot","Spring Boot Framework","Spring Boot Framework Description")
			));
	
	public List<TopicDeatils> getAll()
	{
		return topics;
	}
	public TopicDeatils getone(String id)
	{
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	public void addValues(TopicDeatils td) {
		topics.add(td);
		
	}
	
}
