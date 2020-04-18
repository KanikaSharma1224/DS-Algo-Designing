package com.practice.algo;

public class SelectionSort {
	public static void selection(int[] nums) {
		int min = 0;
		int temp = 0;
		int j;
		for (int i = 0; i < nums.length-1; i++) {
			min = i;
			for (j = i + 1; j < nums.length; j++) {
				if (nums[j] < nums[min]) {
					min = j;
				}
			}
			temp = nums[i];
			nums[i] = nums[min];
			nums[min] = temp;

		}
	}

	public static void main(String[] args) {
		int[] nums = {64,25,12,22,11};
		selection(nums);
		for (int x : nums) {
			System.out.print(x + " ");
		}

	}

}
