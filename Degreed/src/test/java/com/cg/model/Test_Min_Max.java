package com.cg.model;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Test_Min_Max {
	MinMaxFinder m=new MinMaxFinder();
	int numbers[]=new int[]{56,87,65,2,12,45,7,80};
	int solutions[]=m.findMinMax(numbers);
	@Test
	public void test() {
		
		assertArrayEquals(solutions,new int[]{2,87});
		
		
	}
	@Test
	public void test1() {
		
		assertArrayEquals(solutions,new int[]{87,2});
		
		
	}
	@Test
	public void test2() {
		
		assertArrayEquals(solutions,new int[]{1,90});
		
		
	}

	
}
