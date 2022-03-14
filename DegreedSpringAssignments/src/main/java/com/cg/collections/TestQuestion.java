package com.cg.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("Collection.xml");
		Question q=context.getBean("question",Question.class);
		q.DisplayList();
		q.getAnswers();
		q.DisplaySet();
		q.getSecondanswers();
		q.DisplayMap();
		q.getThirdanswers();

	}

}
