package com.cg.model;

public class Employee_Detail {
	private int id;
	private String name;
	public Employee_Detail(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee_Detail [id=" + id + ", name=" + name + "]";
	}
	

}
