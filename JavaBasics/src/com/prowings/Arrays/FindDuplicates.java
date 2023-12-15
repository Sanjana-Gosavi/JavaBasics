package com.prowings.Arrays;

public class FindDuplicates {

	public static void main(String[] args) {
		int[] arr = {10, 8, 6, 8, 5,10};
		//int n = arr.length;
		findDuplicates(arr);
	}

	public static void findDuplicates(int[] arr) {

		for(int i = 0; i<arr.length;i++) {
			for(int j = i+1; j< arr.length;j++)
			{
				if(arr[i]==arr[j])
				System.out.println(arr[j]);
			}
		}
	}
}
