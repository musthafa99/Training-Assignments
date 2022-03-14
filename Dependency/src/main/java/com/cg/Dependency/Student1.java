package com.cg.Dependency;


public class Student1 {
	private Mathcheat mc;
	
	public void setMc(Mathcheat mc) {
		this.mc = mc;
	}
	public void cheat()
	{
		mc.mathcheat();
		
	}
	
}
