package com.cg.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AirtelService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		Airtel airtel=context.getBean("airtel",Airtel.class);
		airtel.display();
		

	}

}
