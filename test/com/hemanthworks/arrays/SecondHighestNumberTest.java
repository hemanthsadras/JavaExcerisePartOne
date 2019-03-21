package com.hemanthworks.arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class SecondHighestNumberTest {
	
	private SecondHighestNumber secondHighestNumber = new SecondHighestNumber();

	@Test
	public void test1() {
		int[] array = {1,2,3,4,51,6};
		int result = secondHighestNumber.findSecondHighestNumber(array);
		assertEquals(6,result);
	}
	
	@Test
	public void test2() {
		int [] array = {10,9,8,7,4,5,3,2,1};
		int result = secondHighestNumber.findSecondHighestNumber(array);
		assertEquals(result, 9);
	}
	
	@Test
	public void test3() {
		int [] array = null;
		int result = secondHighestNumber.findSecondHighestNumber(array);
		assertEquals(result, -101);
	}
	
	@Test
	public void test4() {
		int [] array = {10};
		int result = secondHighestNumber.findSecondHighestNumber(array);
		assertEquals(result, 10);
	}
	
	@Test
	public void test5() {
		int [] array = {10,10,10};
		int result = secondHighestNumber.findSecondHighestNumber(array);
		assertEquals(result, 10);
	}
	
	@Test
	public void test6() {
		int [] array = {-10,0,6,99,-4,-5,33,94,92,93};
		int result = secondHighestNumber.findSecondHighestNumber(array);
		assertEquals(result, 10);
	}
	
	@Test
	public void test7() {
		int [] array = {-10,0,6,99,-4,-5,33};
		int result = secondHighestNumber.findSecondHighestNumber(array);
		assertEquals(result, 33);
	}
	
	@Test
	public void test8() {
		int[] array = {99,99,99};
		int result = secondHighestNumber.findSecondHighestNumber(array);
		assertEquals(result,99);
	}
	
	@Test
	public void test9() {
		int [] array = {1,2,3,4,5,6,7,8,9};
		int result = secondHighestNumber.findSecondHighestNumber(array);
		assertEquals(result, 8);
	}
	

}
