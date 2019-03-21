package com.hemanthworks.arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultipleDuplicatesTest {
	
	private MultipleDuplicates multipleDuplicates = new MultipleDuplicates();

	@Test
	public void test1() {
		int[] array = {1,2,3,4,5,6};
		int[] result = multipleDuplicates.findAllDuplicateNumbers(array);
		int[] expected = {-101};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test2() {
		int[] array = {};
		int[] result = multipleDuplicates.findAllDuplicateNumbers(array);
		int[] expected = {-101};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test3() {
		int[] array = {1};
		int[] result = multipleDuplicates.findAllDuplicateNumbers(array);
		int[] expected = {-101};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test4() {
		int[] array = {1,2,1};
		int[] result = multipleDuplicates.findAllDuplicateNumbers(array);
		int[] expected = {1};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test5() {
		int[] array = {1,2,3,4,5,6,7,1,9,2,0,4};
		int[] result = multipleDuplicates.findAllDuplicateNumbers(array);
		int[] expected = {1,2,4};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test6() {
		int[] array = {1,2,3,4,5,6,1,2};
		int[] result = multipleDuplicates.findAllDuplicateNumbers(array);
		int[] expected = {1,2};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test7() {
		int[] array = {1,1,1,1,2,3,4,5,6,2,3,4};
		int[] result = multipleDuplicates.findAllDuplicateNumbers(array);
		int[] expected = {1,2,3,4};
		assertArrayEquals(expected, result);
		assertEquals(6,result);
	}
	
	@Test
	public void test8() {
		int[] array = {1,2,2,4,4,6};
		int[] result = multipleDuplicates.findAllDuplicateNumbers(array);
		int[] expected = {2,4};
		assertArrayEquals(expected, result);
	}
	

}
