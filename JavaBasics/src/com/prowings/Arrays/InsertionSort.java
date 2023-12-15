package com.prowings.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int[] arr = { 2, 7, 9, 1, 5 };
		InsertionSort(arr);
	}

	public static void InsertionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int current = arr[i];
			int j = i - 1;
			while (j >= 0 && current < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = current;
		}
		printArray(arr);
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "");
		}
		System.out.println();
	}
}
