package com.cg.model;

import java.text.NumberFormat;
import java.util.*;

public class Employee {
	private int empid;
	private String name;
	private String ssn;
	private double salary;
	
	public Employee(int empid,String name,String ssn,double salary)
	{
		this.empid=empid;
		this.name=name;
		this.ssn=ssn;
		this.salary=salary;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void raiseSalary(double increment)
	{
		salary+=increment;
	}
	public void printEmployee()
	{
		System.out.print("Employee Id:"+empid+" Employee name:"+name+" Employee SSN:"+ssn+" Employee Salary:"+NumberFormat.getCurrencyInstance(Locale.US).format((double)salary));
	}
}
