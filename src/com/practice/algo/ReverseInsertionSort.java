package com.practice.algo;

public class ReverseInsertionSort {
	public static void reverseInsertion(int[] numbers) {
		int i;
		for (int j = 1; j < numbers.length; j++) {
			int key = numbers[j];
			i = j - 1;
			while (i >= 0 && numbers[i] < key) {
				numbers[i + 1] = numbers[i];
				i = i - 1;
			}
			numbers[i + 1] = key;
		}
	}

	public static void main(String[] args) {
		int[] numbers = { 31, 41, 59, 26, 41, 58 };
		reverseInsertion(numbers);
		for (int e : numbers)
			System.out.print(e + " ");
	}

}
