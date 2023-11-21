package com.prowings.loops;

import java.util.Arrays;

public class SecondHighestNumberFromArray {
	
	public static void main(String[] args) {
		
		int[] numbers = {12,9,3,90,8,5,56,6};
		
		System.out.println("Input array is:" + Arrays.toString(numbers));
		
		int secondHighest = secondHighestNumber(numbers);
		System.out.println("Second Highest number from array is: " +secondHighest);
		
	}

	public static int secondHighestNumber(int[] numbers) {
		
		int temp = 0;
		for(int i = 0; i < numbers.length;i++)
		{
			for(int j = i+1 ;j < numbers.length; j++)
			{
				if(numbers[i] > numbers[j])
				{
						temp = numbers[i];
						numbers[i] = numbers[j];
						numbers[j] = temp;
				}
			}
		}
		System.out.println("Sorted array is:"+Arrays.toString(numbers));
		return numbers[numbers.length - 2];
	}

}
