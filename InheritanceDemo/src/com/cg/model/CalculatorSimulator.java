package com.cg.model;

public class CalculatorSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxCalculator t=new TaxCalculator();
		
		try {
			System.out.println("Tax Amount is "+t.Calculatetax("Arjun","True",55000));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
			
		
	}

}
