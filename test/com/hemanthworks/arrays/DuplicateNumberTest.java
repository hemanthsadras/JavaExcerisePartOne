package com.hemanthworks.arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class DuplicateNumberTest {
	
	private DuplicateNumber duplicateNumber = new DuplicateNumber();

	@Test
	public void test1() {
		int[] array = {1,2,3,4,5,6};
		int result = duplicateNumber.findDuplicateNumber(array);
		assertEquals(-101,result);
	}
	
	@Test
	public void test2() {
		int [] array = {};
		int result = duplicateNumber.findDuplicateNumber(array);
		assertEquals(-101,result);
	}
	
	@Test
	public void test3() {
		int [] array = {1,1,1,1,1,1};
		int result = duplicateNumber.findDuplicateNumber(array);
		assertEquals(1,result);
	}
	
	@Test
	public void test4() {
		int [] array = {1,1,2,3,4,1};
		int result = duplicateNumber.findDuplicateNumber(array);
		assertEquals(1,result);
	}
	
	@Test
	public void test5() {
		int [] array = {1,2,3,4,1};
		int result = duplicateNumber.findDuplicateNumber(array);
		assertEquals(1,result);
	}
	
	@Test
	public void test6() {
		int [] array = {-10,10,9,6,-10};
		int result = duplicateNumber.findDuplicateNumber(array);
		assertEquals(-10,result);
	}
	
	@Test
	public void test7() {
		int [] array = {-10,6,6,99,-4,-5,33};
		int result = duplicateNumber.findDuplicateNumber(array);
		assertEquals(6,result);
	}
	
	@Test
	public void test8() {
		int[] array = {99,0,0,0,98,33,44};
		int result = duplicateNumber.findDuplicateNumber(array);
		assertEquals(0,result);
	}
	

}

