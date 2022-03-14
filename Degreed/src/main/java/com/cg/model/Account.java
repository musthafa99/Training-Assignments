package com.cg.model;

public class Account {
	public static void main(String args[])
	{
		BankAccount b=new BankAccount();
		try {
			System.out.println(b.withdraw(200));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
}
