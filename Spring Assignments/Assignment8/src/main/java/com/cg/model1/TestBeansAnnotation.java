package com.cg.model1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeansAnnotation {
	public static void main(String args[])
	{
		System.out.println("Using Annotations");
		ConfigurableApplicationContext start=new ClassPathXmlApplicationContext("bean.xml");
		BeansAnnotation s=start.getBean("annotation",BeansAnnotation.class);
		s.Sum();
		s.Multiply();
		start.close();
	}

}
