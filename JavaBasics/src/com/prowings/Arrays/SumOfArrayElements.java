package com.prowings.Arrays;

public class SumOfArrayElements {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		int sum = sumOfElements(arr);
		System.out.println("Sum of arrays elements is:" +sum);
		
	}

	public static int sumOfElements(int[] arr) {
		

		int sum = 0;
		
		for(int i = 0;i<arr.length;i++)
		{
			sum += arr[i];
		}
		return sum;
	}
}
