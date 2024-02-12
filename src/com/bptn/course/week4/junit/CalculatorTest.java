package com.bptn.course.week4.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	Calculator calculator =new Calculator();
	
	
	@Test
	public void testAdd() {
		
		assertEquals(5, calculator.add(2, 3));
		assertEquals(-1, calculator.add(-2, 1));
	}
	
	@Test
	public void testSubtract() {
		
		assertEquals(-1, calculator.sub(2, 3));
		assertEquals(-3, calculator.sub(-2, 1));
		
	}
	
	@Test
	public void testMultiply() {
		assertEquals(6, calculator.multiply(2, 3));
		assertEquals(20, calculator.multiply(2, 10));
		
	}
	 

}
