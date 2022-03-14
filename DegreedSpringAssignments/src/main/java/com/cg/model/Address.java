package com.cg.model;

public class Address {
	private String street;
	private String city;
	private String state;
	private String zipcode;
	private String country;
	public void setStreet(String street) {
		this.street = street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void DisplayAddress() {
		System.out.println("Street : "+street);
		System.out.println("city : "+city);
		System.out.println("state : "+state);
		System.out.println("zipcode : "+zipcode);
		System.out.println("country : "+country);
		
	}
	
	
}
