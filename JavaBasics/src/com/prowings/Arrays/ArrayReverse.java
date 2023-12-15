package com.prowings.Arrays;

import java.util.Arrays;

public class ArrayReverse {
	
	public static void main(String[] args) {
		
		int[] nums = {2, 7, 76, 4, 9};
		System.out.println("Reversed array is:" +Arrays.toString(reversedArray(nums)));
	}

	public static int[] reversedArray(int[] nums) {

		int[] reversedArray = new int[nums.length];
		int count = 0;
		for(int i = nums.length - 1; i >= 0; i--)
		{
			reversedArray[count] = nums[i];
			count++;
		}
		return reversedArray;
	}
	
	
	
	
	
}
