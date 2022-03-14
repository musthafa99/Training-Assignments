package com.cg.Dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Student1 stu=context.getBean("student",Student1.class);
		stu.cheat();
		
		AnotherStudent st=context.getBean("student1",AnotherStudent.class);
		st.cheat();
	}

}
