package com.cg.jdbcAssignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDbConfig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con=new AnnotationConfigApplicationContext(configuration.class);
		Dbconfig d=con.getBean("dbconfig",Dbconfig.class);
		d.display();

	}

}
