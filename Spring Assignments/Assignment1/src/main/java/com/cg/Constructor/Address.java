package com.cg.Constructor;

public class Address {
	private String street;
	private String city;
	private String state;
	private String zipcode;
	private String country;
	
	public Address(String street, String city, String state, String zipcode, String country) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
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
