package com.cg.model;

public class testEmolyee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Engineer(101,"Jane Smith","012-34-5678",120345.27);
		Employee e2=new Manager(207,"Barbara Jhonson","054-12-2367",109501.36,"US Marketing");
		Employee e3=new Admin(304,"Bill Munroe","108-23-6509",75002.34);
		Employee e4=new Director(12,"Susan Wheeler","009-45-2340",120567.36,"Global Marketing",1000000.00);
		e1.printEmployee();
		System.out.println();
		e2.printEmployee();
		System.out.println();
		e3.printEmployee();
		System.out.println();
		e4.printEmployee();
		System.out.println();

	}

}
