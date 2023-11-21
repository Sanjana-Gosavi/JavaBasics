package com.prowings.loops;
import java.util.Arrays;

public class FilterEvenNumbersFromArray {

	public static int[] filterEvenNumbers(int[] nums)
	{
		System.out.println("Input array is:" + Arrays.toString(nums));
		
		int counter1 = 0;
		
		for(int i = 0; i< nums.length; i++)
		{
			if(nums[i] % 2 == 0)
			{
				counter1++;
			}
		}
		int counter2 = 0;
		int[] result = new int[counter1];
		
		for(int i = 0; i< nums.length; i++)
		{
			if(nums[i] % 2 == 0)
			{
			
				result[counter2] = nums[i];
				counter2++;
			}
		}
		return result;
		
	}
	public static void main(String[] args) {
		
		int[] nums = {9,70,3,40,34,87,9};
		int[] result = filterEvenNumbers(nums);
		System.out.println("Filtered Even Numbers are:" );
	//	System.out.println(Arrays.toString(result));
		
		for (int n: result)
			System.out.println(n);
		
		
		
	}
}
