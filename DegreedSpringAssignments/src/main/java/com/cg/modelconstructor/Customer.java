package com.cg.modelconstructor;

public class Customer {
	private String customerId;
	private String customerName;
	private String customerContact;
	private Address customerAddress;
	
	
	 public Customer(String customerId, String customerName, String customerContact, Address customerAddress) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}


	public void display()
	 {
		 System.out.println("customer Id : "+customerId);
		 System.out.println("customer Name : "+customerName);
		 System.out.println("customer Contact : "+customerContact);
		customerAddress.DisplayAddress();
	 }
	

}
