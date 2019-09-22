package io.javabrains.springbootstarter.topiccontroller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class topiccontroller {
	
	@Autowired
	private TopicService topicservice;
	
	@RequestMapping("/topics")
	public List<topics> getalltopics()
	{
		
		return topicservice.getalltopics();

	}
	@RequestMapping("/topics/{id}")
	public topics gettopic(@PathVariable String id)
	{
		return TopicService.gettopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addtopic(@RequestBody topics topic)
	{
		TopicService.addtopic(topic);
		
	}
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	public void updatetopic(@RequestBody topics topic,@PathVariable String id)
	{
		TopicService.updatetopic(id,topic);
		
	}

}
