package com.cg.Dependency;

public class Student {
	private int id;
	private String Name;
	public Student(int id, String Name) {
		this.id = id;
		this.Name = Name;
	}

	
	/*public void setId(int id) {
		this.id = id;
	}

	

	

	public void setName(String name) {
		Name = name;
	}*/
	
	

	public void displayname()
	{
		System.out.println("Id: "+ id + " Name: " + Name);
	}

}
