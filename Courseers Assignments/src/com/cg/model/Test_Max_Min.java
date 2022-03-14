package com.cg.model;

public class Test_Max_Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[][]={{16, 22, 99, 4, 18}, {-2, 4, 103, 5, 95}, {117, 6, 15, 2, 45}, {-33, 45, 87, 77, 12}};	
		Max_Min value=new Max_Min();
		value.max_min(numbers);
		value.Output();
	}

}
