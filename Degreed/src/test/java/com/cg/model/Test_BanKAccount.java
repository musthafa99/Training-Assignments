package com.cg.model;

import static org.junit.Assert.*;

import javax.naming.InsufficientResourcesException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Test_BanKAccount {
	BankAccount acc=new BankAccount();
	@Test(expected= Exception.class)
	public void test() throws Exception{
		acc.withdraw(20000);
		
	}
	@Rule
	public ExpectedException thrown=ExpectedException.none();
	@Test
	public void test1() throws Exception{
	
		thrown.expect(Exception.class);
		thrown.expectMessage("Insufficient fund");
		acc.withdraw(20000);
		
		
		
	}
	
	
}
