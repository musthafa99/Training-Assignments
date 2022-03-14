package com.cg.ExampleTopics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Topic {
	@Autowired
	private Topics topics;
	@RequestMapping("/TopicDeatils")
	public List<TopicDeatils> gettopics()
	{
		return topics.getAll();
	}
	@RequestMapping("/TopicDeatils/{id}")
	public TopicDeatils gettopic(@PathVariable String id)
	{
		return topics.getone(id);
	}
	@RequestMapping(method=RequestMethod.POST,value="/TopicDeatils")
	public void Addtopic(@RequestBody TopicDeatils td )
	{
		topics.addValues(td);
	}
}
