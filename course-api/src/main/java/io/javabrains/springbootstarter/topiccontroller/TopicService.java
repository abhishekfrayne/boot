package io.javabrains.springbootstarter.topiccontroller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService
{

	public static List<io.javabrains.springbootstarter.topiccontroller.topics> topics=new ArrayList<> (Arrays.asList(
			new topics("spring","A","java"),
			new topics("C++","B","java"),
			new topics("DBMS","C","java"))) ;
	
	public List<topics>getalltopics()
	{	
		return topics;
	}

	public static topics gettopic(String id)
	{
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public static void addtopic(topics topic) 
	{
		topics.add(topic);
		
	}

	public static void updatetopic(String id,topics topic) 
	{
		for(int i=0;i<topics.size();i++)
		{
			topics t=topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i,topic);
			return;
			}
		}
		
	}

}
