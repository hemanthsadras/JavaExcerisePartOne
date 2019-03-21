package com.hemanthworks.arrays;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SumOfArrayTest {
	
	private SumOfArray sumOfArray = new SumOfArray();

	@Test
	public void test1() {
		int[] array = {1,2,3,4,5,6};
		int result = sumOfArray.findSumOfArray(array);
		int expected = Arrays.stream(array).sum();
		assertEquals(expected,result);
	}
	
	@Test
	public void test2() {
		int [] array = {};
		int result = sumOfArray.findSumOfArray(array);
		assertEquals(0,result);
	}
	
	@Test
	public void test3() {
		int [] array = null;
		int result = sumOfArray.findSumOfArray(array);
	
		assertEquals(0,result);
	}
	
	@Test
	public void test4() {
		int [] array = {10};
		int result = sumOfArray.findSumOfArray(array);
		int expected = Arrays.stream(array).sum();
		assertEquals(expected,result);
	}
	
	@Test
	public void test5() {
		int [] array = {10,10,10};
		int result = sumOfArray.findSumOfArray(array);
		int expected = Arrays.stream(array).sum();
		assertEquals(expected,result);
	}
	
	@Test
	public void test6() {
		int [] array = {-10,10};
		int result = sumOfArray.findSumOfArray(array);
		int expected = Arrays.stream(array).sum();
		assertEquals(expected,result);
	}
	
	@Test
	public void test7() {
		int [] array = {-10,0,6,99,-4,-5,33};
		int result = sumOfArray.findSumOfArray(array);
		int expected = Arrays.stream(array).sum();
		assertEquals(expected,result);
	}
	
	@Test
	public void test8() {
		int[] array = {99,0,0,0,98,33,44};
		int result = sumOfArray.findSumOfArray(array);
		int expected = Arrays.stream(array).sum();
		assertEquals(expected,result);
	}
	

}
