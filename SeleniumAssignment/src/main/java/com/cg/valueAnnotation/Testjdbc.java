package com.cg.valueAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Testjdbc {
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Jdbc.xml");
		Jdbc j=context.getBean("config",Jdbc.class);
		j.display();
	}

}
