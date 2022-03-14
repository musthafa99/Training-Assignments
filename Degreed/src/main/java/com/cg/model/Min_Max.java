package com.cg.model;

public class Min_Max {
	public static void main(String args[])
	{
		MinMaxFinder f=new MinMaxFinder();
		
		int numbers[]=new int[]{56,87,65,2,12,45,7,80};
		int solution[]=f.findMinMax(numbers);
		for(int i=0;i<2;i++)
		{
			System.out.println(solution[i]);
		}
	}
}
