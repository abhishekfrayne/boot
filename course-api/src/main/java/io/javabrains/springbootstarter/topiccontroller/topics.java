package io.javabrains.springbootstarter.topiccontroller;


public class topics {

	private String id;
	private String name;
	private String desp;

	
	public topics(String id,String name,String desp)
	{
		
		this.id=id;
		this.name=name;
		this.desp=desp;
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesp() {
		return desp;
	}
	public void setDesp(String desp) {
		this.desp = desp;
	}
	
	
	
	

}
