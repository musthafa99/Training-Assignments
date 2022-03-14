package com.cg.model;

public class BankAccount {
	int balance=10000;
	public int withdraw(int amount) throws Exception
	{
		if(balance<amount)
		{
			throw new Exception("Insufficient fund");
		}
		else
		{
			balance=balance-amount;
		}
		return balance;
	}
}
