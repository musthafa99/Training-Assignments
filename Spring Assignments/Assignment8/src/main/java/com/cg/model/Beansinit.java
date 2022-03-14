package com.cg.model;

public class Beansinit {
	private String message;
	

	public void setMessage(String message) {
		this.message = message;
	}

	public void display() {
		System.out.println("Message is: "+message);
	}

	public void init()
	{
		System.out.println("The INIT() method is Intialized");
		display();
	}
	
	public void destroy()
	{
		System.out.println("The DESTROY() method is Intialized");
	}


}
