package com.prowings.Arrays;

import java.util.Arrays;

public class IntersectionAndUnion {
	public static void main(String[] args) {

		int[] arr1 = { 10, 2, 98, 4, 3 };
		int[] arr2 = { 3, 4, 8, 65, 10 };

		System.out.println("Union:" + Arrays.toString(union(arr1, arr2)));

		System.out.println("Intersection" + Arrays.toString(intersection(arr1, arr2)));
	}

	public static int[] union(int[] arr1, int[] arr2) {

		int n = arr1.length;
		int m = arr2.length;
		int[] result = new int[n + m];
		System.arraycopy(arr1, 0, result, 0, n);
		
		
		
		int count = n;
		boolean flag = true;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < result.length; j++) {
				if (arr2[i] != result[j]) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
			if (flag) {
				result[count++] = arr2[i];
			}
		}
		
		
		
		int[] union = new int[count];
		for (int i = 0; i < count; i++) {
			union[i] = result[i];
		}
		return union;
	}

	
	
	public static int[] intersection(int[] arr1, int[] arr2) {
		int n = arr1.length, m = arr2.length;
		int[] element = new int[(n < m) ? n : m];

		boolean flag = false;
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					flag = true;
					break;
				} else {
					flag = false;
				}
			}
			if (flag) {
				element[count] = arr1[i];
				count++;
			}
		}

		int[] array = new int[count];
		for (int i = 0; i < count; i++) {
			array[i] = element[i];
		}

		return array;
	}

}
