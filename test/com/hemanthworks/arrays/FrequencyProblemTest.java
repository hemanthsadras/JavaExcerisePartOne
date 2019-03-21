package com.hemanthworks.arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class FrequencyProblemTest {
	
	private FrequencyProblem frequencyProblem = new FrequencyProblem();

	@Test
	public void test1() {
		int[] array = {1,2,3,4,5,6};
		int result = frequencyProblem.findNumberWithMaximumFrequency(array);
		int expected = 1;
		assertEquals(expected, result);
	}
	
	@Test
	public void test2() {
		int[] array = {1,2,3,4,5,6,1};
		int result = frequencyProblem.findNumberWithMaximumFrequency(array);
		int expected = 1;
		assertEquals(expected, result);
	}
	
	@Test
	public void test3() {
		int[] array = {};
		int result = frequencyProblem.findNumberWithMaximumFrequency(array);
		int expected = -101;
		assertEquals(expected, result);
	}
	
	@Test
	public void test4() {
		int[] array = {1,2,3,4,5,6,2,2,2,2,4,4,3,2};
		int result = frequencyProblem.findNumberWithMaximumFrequency(array);
		int expected = 2;
		assertEquals(expected, result);
	}
	
	@Test
	public void test5() {
		int[] array = {2,2,2,3,4,5,6,6,6,7,3,4,7};
		int result = frequencyProblem.findNumberWithMaximumFrequency(array);
		int expected = 2;
		assertEquals(expected, result);
	}
	
	@Test
	public void test6() {
		int[] array = {2,2,2,3,4,5,6,6,7,3,4,7};
		int result = frequencyProblem.findNumberWithMaximumFrequency(array);
		int expected = 2;
		assertEquals(expected, result);
	}
	
	@Test
	public void test7() {
		int[] array = {2,3,4,5,6,2,6,7,3,4,7,2,2};
		int result = frequencyProblem.findNumberWithMaximumFrequency(array);
		int expected = 2;
		assertEquals(expected, result);
	}
	
	@Test
	public void test8() {
		int[] array = {0,1,0,3,4,5,6};
		int result = frequencyProblem.findNumberWithMaximumFrequency(array);
		int expected = 0;
		assertEquals(expected, result);
	}
	

}

