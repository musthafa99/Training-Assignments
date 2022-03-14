package com.cg.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


class Test_Field {
	Employee_Detail e1=new Employee_Detail(101,"Ashok");
	@BeforeAll
	public static void Setup()
	{
		System.out.println("once");
	}
	@Test	
	@DisplayName("TEST_NAME")
	public void testName() {
		assertTrue(e1.getName().equals("Ashok"));
		System.out.println("True");
		
	}
	@Test
	@Disabled
	public void testId() {
		assertEquals(e1.getId(),101);
		
	}

}
