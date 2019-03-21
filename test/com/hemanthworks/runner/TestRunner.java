package com.hemanthworks.runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.hemanthworks.arrays.DuplicateNumberTest;
import com.hemanthworks.arrays.FrequencyProblemTest;
import com.hemanthworks.arrays.LargestNumberTest;
import com.hemanthworks.arrays.MultipleDuplicatesTest;
import com.hemanthworks.arrays.SecondHighestNumberTest;
import com.hemanthworks.arrays.SumOfArrayTest;

@RunWith(Suite.class)
@SuiteClasses({LargestNumberTest.class,
		DuplicateNumberTest.class,
		FrequencyProblemTest.class,
		MultipleDuplicatesTest.class,
		SecondHighestNumberTest.class,
		SumOfArrayTest.class
})
public class TestRunner {

}
