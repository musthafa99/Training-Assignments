package com.cg.model;

public class TaxCalculator 
{
	
	private int taxAmount=0;
	public int Calculatetax(String empName,String isIndian,int Salary)throws Exception
	{
		if(isIndian=="False")
		{
			throw new Exception ("CountryNotValidException");
		}
		if(empName==" ")
		{	
			throw new Exception ("NameNotValidException");
		}
		
		if(Salary>100000 && isIndian=="True")
		{
			taxAmount=Salary*8/100;
		}
		else if((Salary<50000 || Salary<100000) && isIndian=="True")
		{
			taxAmount=Salary*6/100;
		}
		else if((Salary<20000 || Salary<50000) && isIndian=="True")
		{
			taxAmount=Salary*5/10;
		}
		else if((Salary<10000 || Salary<30000) && isIndian=="True")
		{
			taxAmount=Salary*4/100;
		}
		else
		{
			throw new Exception("TaxNotEligibleException");
		}
		return taxAmount;
	}
}
