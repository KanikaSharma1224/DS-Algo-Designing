package com.practice.algo;

public class InsertionSort {
	public static Integer[] sort(Integer[] numbers) {
		int j;
		for (j = 1; j < numbers.length; j++) {
			int key = numbers[j];
			int i = j - 1;
			while (i >= 0 && numbers[i] > key) {
				numbers[i + 1] = numbers[i];
				i = i - 1;
			}
			numbers[i + 1] = key;
		}
		return numbers;
	}
}
