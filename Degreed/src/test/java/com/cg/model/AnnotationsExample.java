package com.cg.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
//import static org.junit.Assert.*;
import org.junit.Test;






public class AnnotationsExample {
	
	@BeforeClass
	public static void Setup()
	{
		System.out.println("BeforeAll --Annotation is used");
		
	}
	@Before
	public void Setup1()
	{
		System.out.println("BeforeEach --Annotation is used");
		
	}
	@Test
	public void test()
	{
		System.out.println("Test 1");
		
	}
	@Test
	public void test1() {
		System.out.println("Test 2");
		
	}
	@AfterClass
	public static void Setup2()
	{
		System.out.println("AfterAll --Annotation is used");
		
	}
	@After
	public void Setup3()
	{
		System.out.println("AfterEach --Annotation is used");
		
	}
	
	

}
