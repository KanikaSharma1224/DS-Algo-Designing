package com.practice.algo;

public class MergeSort {
	public static void sort(int[] arr, int l, int r) {
		System.out.println(" Sort method ::: " + " l = "+ l +" , "+ "r = "+ r);
		if (l < r) {
			int m = (l + r) / 2;
			System.out.println("Inside sort method If condition:::  " + "m = "+ m);
			//System.out.println("calling sort method with l = " + l + " m = " + m);
			sort(arr, l, m);
			//System.out.println("calling sort method with l = " + l + " m = " + m);
			sort(arr, m + 1, r);
			//System.out.println("calling merge method with l = " + l + " m = " + m + " r = " + r);
			merge(arr, l, m, r);
		}
	}

	public static void merge(int[] arr, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		//System.out.println("Inside merge --- ");
		//System.out.println("n1 = " + n1);
		//System.out.println("n2 = " + n2);

		int[] L = new int[n1];
		int[] R = new int[n2];
		for (int i = 0; i < n1; i++) {
			L[i] = arr[l + i];
		}
		for (int j = 0; j < n2; j++) {
			R[j] = arr[m + 1 + j];
		}

		int i = 0, j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 12, 11, 13, 5, 6, 7 , 3};
		sort(arr, 0, arr.length - 1);
		for (int x : arr) {
			System.out.print(x + " ");
		}

	}

}
