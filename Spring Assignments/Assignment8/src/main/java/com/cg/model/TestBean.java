package com.cg.model;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
	public static void main(String args[])
	{
		System.out.println("Using XML Configuration");
		ConfigurableApplicationContext start=new ClassPathXmlApplicationContext("beans.xml");
		start.close();
	}

}
