package com.cg.model;

public class MinMaxFinder {
	int min_max[]=new int[2];
	int max=Integer.MIN_VALUE;
	int min=Integer.MAX_VALUE;
	
	
	public int[] findMinMax(int num[])
	{
		for(int i=0;i<num.length;i++)
		{
			
				if(max<num[i])
				{
					max=num[i];
					min_max[1]=max;
					
				}
				if(min>num[i])
				{
					min=num[i];
					min_max[0]=min;
					
				}
			
		}
		return min_max;
	}

}
