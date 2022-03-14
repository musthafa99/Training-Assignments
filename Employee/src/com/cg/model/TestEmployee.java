package com.cg.model;


public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee e1 = new Employee();
	      e1.setId(01);
	      e1.setName("John");
	      e1.setSocialSecurityNumber("5674-9876-998");
	      e1.setSalary(25000.00);
	      System.out.println(e1); 
	      System.out.println("id is: " + e1.getID());
	      System.out.println("name is: " + e1.getName());
	      System.out.println("salary is: " + e1.getsocial_security_number());
	      System.out.println("salary is: " + e1.getSalary());
	      
	     
	}

}
