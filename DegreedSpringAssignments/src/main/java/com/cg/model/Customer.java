package com.cg.model;

public class Customer {
	private String customerId;
	private String customerName;
	private String customerContact;
	private Address customerAddress;
	
	
	
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerId() {
		return customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	
	 public void display()
	 {
		 System.out.println("customer Id : "+customerId);
		 System.out.println("customer Name : "+customerName);
		 System.out.println("customer Contact : "+customerContact);
		customerAddress.DisplayAddress();
	 }
	

}
