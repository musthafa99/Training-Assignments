package com.cg.model;

public class Max_Min {
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int max_index[]=new int[4];
		
		public void max_min(int num[][])
		{
			for(int i=0;i<num.length;i++)
			{
				for(int j=0;j<num[i].length;j++)
				{
					if(max<num[i][j])
					{
						max=num[i][j];
						max_index[0]=i;
						max_index[1]=j;	
					}
					if(min>num[i][j])
					{
						min=num[i][j];
						max_index[2]=i;
						max_index[3]=j;	
					}
				}
			}
		}
		public void Output()
		{
			System.out.println("Maximum value is: "+ max + " at index: "+max_index[0]+","+max_index[1]);
			System.out.println("Minimum value is: "+ min+ " at index: "+max_index[2]+","+max_index[3]);
		}
		
		
}
