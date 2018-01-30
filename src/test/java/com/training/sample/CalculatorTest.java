package com.training.sample;
import static org.junit.Assert.*;
//import org.junit.jupiter.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.training.sample.JunitDemo.calculator;

 @RunWith(JUnitPlatform.class)
public class CalculatorTest {
	

	calculator calculator =null;
	

	@BeforeAll
	static void init()
	{
		System.out.println("called before all the test cases");
	}
	
	@BeforeEach
	void setup()
	{
		calculator=new calculator();
		System.out.println("called before each test");
	}
	@AfterEach
	void teardown()
	{
		calculator=null;
		System.out.println("called after each test");
	}
	@Test
	@DisplayName(value="testing add method")
	public void testAdd()
	{
		int sum =calculator.add(20,40);
		assertEquals(60, sum);
	}
		@Test
		@DisplayName(value="testing divide method")
		public void testdivide()
		{
			assertEquals(1, calculator.divide(30, 30));
			//int div=calculator.divide(30, 15);
			
		}
		@Test
		public void testNegDivide()
		{
			assertThrows(ArithmeticException, executable)
		}
		
	
	@AfterAll
	static void cleanup(){
		System.out.println("called after all test cases");
	}
}
