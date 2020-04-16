package com.practice.algo.search;

public class LinearSearch {
	public static int search(int[] elements, int key) {

		for (int i = 0; i < elements.length; i++) {
			if (key == elements[i])
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] numbers = {31, 41, 59, 26, 41, 58};
		int res = search(numbers, 85);
		if(res == -1)
			System.out.println("Number not found");
		else
			System.out.println("Number is at index " + res);

	}

}
