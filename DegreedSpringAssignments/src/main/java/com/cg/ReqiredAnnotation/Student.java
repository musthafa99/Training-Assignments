package com.cg.ReqiredAnnotation;




import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Student {
	private int id;
	private String name;
	private String hobby;

	private Address adress;
	@Required
	public void setName(String name) {
		this.name = name;
	}
	@Required
	public void setId(int id) {
		this.id = id;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void setAdress(Address adress) {
		this.adress = adress;
	}
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
		System.out.println("Hobby: "+hobby);
		System.out.println("Address: "+adress);
	}

}
