package com.practice.algo;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class InsertionSortTest {
	private Integer[] input;
	private Integer[] expected;

	@Test
	public void numbersShouldSort() {
		/*
		 * InsertionSort iSort = new InsertionSort(); assertArrayEquals(expected,
		 * iSort.sort(input));
		 */
		fail("Not Implemented yet");
		
	}

//	@Parameters
//	public static Collection<Integer[]> getParameters() {
//		/*
//		 * return Arrays.asList(new Integer[][]{ { { 5, 2, 4, 6, 1, 3 }, { 1, 2, 3, 4,
//		 * 5, 6 } }, { { 15, 23, 10, 16, 12, 21, 9 }, { 9, 10, 12, 15, 16, 21, 23 } }
//		 * });
//		 */
//	}

	public InsertionSortTest(Integer[] input, Integer[] expected) {
		this.input = input;
		this.expected = expected;
	}

}
