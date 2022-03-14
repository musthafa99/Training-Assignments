package com.cg.model;

public class Product {
	int product_value=0;
	public int product(int a,int b)
	{
		product_value=a*b;
		return product_value;
	}
	public void prodOutput()
	{
		System.out.println("The Product is: "+product_value);
	}
}
