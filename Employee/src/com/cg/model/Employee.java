package com.cg.model;

public class Employee {
	public int id;
	public String name;
	public String social_security_number;
	public double salary;
	
	public Employee()
	{
	
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSocialSecurityNumber(String social_security_number)
	{
		this.social_security_number=social_security_number;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public int getID()
	{
		return id;
	}
	public double getSalary()
	{
		return salary;
	}
	public String getName()
	{
		return name;
	}
	public String getsocial_security_number()
	{
		return social_security_number;
	}
	
}
