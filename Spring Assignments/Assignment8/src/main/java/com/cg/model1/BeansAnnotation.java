package com.cg.model1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeansAnnotation {
	private int a;
	private int b;
	@PostConstruct
	public void init()
	{
		a=876;
		b=98;
	}
	public void Sum() 
	{
		init();
		System.out.println(a+b);
	}
	
	public void Multiply()
	{
		init();
		System.out.println(a*b);
	}
	@PreDestroy
	public void message()
	{
		System.out.println("Hello Program Works Fine");
	}
}
