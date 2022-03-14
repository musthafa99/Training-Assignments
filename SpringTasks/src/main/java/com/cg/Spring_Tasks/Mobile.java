package com.cg.Spring_Tasks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded");
		Sim sim=context.getBean("sim",Sim.class);
		sim.calling();
		sim.data();

	}

}
