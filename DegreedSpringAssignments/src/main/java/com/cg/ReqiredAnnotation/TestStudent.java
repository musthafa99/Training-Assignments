package com.cg.ReqiredAnnotation;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
		Student stu=con.getBean("student",Student.class);
		stu.display();

	}

}
