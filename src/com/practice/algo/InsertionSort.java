package com.practice.algo;

public class InsertionSort {
	public static void sort(int[] numbers) {
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
		for (int x : numbers) {
			System.out.print(x + " ");
		}
	}

	public static void main(String[] args) {
		int[] numbers = { 5, 2, 4, 6, 1, 3 };
		sort(numbers);
	}

}
