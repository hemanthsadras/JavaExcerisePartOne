package com.hemanthworks.arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class LargestNumberTest {
	
	private LargestNumber largestNumber = new LargestNumber();

	@Test
	public void test1() {
		int[] array = {1,2,3,4,5,6};
		int result = largestNumber.findLargestNumber(array);
		assertEquals(6,result);
	}
	
	@Test
	public void test2() {
		int [] array = {};
		int result = largestNumber.findLargestNumber(array);
		assertEquals(result, -101);
	}
	
	@Test
	public void test3() {
		int [] array = null;
		int result = largestNumber.findLargestNumber(array);
		assertEquals(result, -101);
	}
	
	@Test
	public void test4() {
		int [] array = {10};
		int result = largestNumber.findLargestNumber(array);
		assertEquals(result, 10);
	}
	
	@Test
	public void test5() {
		int [] array = {10,10,10};
		int result = largestNumber.findLargestNumber(array);
		assertEquals(result, 10);
	}
	
	@Test
	public void test6() {
		int [] array = {-10,10};
		int result = largestNumber.findLargestNumber(array);
		assertEquals(result, 10);
	}
	
	@Test
	public void test7() {
		int [] array = {-10,0,6,99,-4,-5,33};
		int result = largestNumber.findLargestNumber(array);
		assertEquals(result, 99);
	}
	
	@Test
	public void test8() {
		int[] array = {99,0,0,0,98,33,44};
		int result = largestNumber.findLargestNumber(array);
		assertEquals(result,99);
	}
	

}
