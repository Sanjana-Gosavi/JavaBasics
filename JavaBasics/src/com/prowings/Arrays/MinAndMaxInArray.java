package com.prowings.Arrays;

public class MinAndMaxInArray {
	public static void main(String[] args) {
		 
		int[] nums = {2,7,98,4,8,1};
		 
		minAndMax(nums); 
	}

	public static void minAndMax(int[] nums) {
		int temp = 0, i;
		
		for(i = 0; i<nums.length; i++)
		{
			for(int j = i+1; j<nums.length; j++)
			{
				if(nums[i] > nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		int min = nums[0];
		int max = nums[i-1];
		System.out.println("min number in an array is:" +min);
		System.out.println("Max number in an array is:" +max);
		
	}
	
}
