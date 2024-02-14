package com.prowings.Arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayShuffle {

	
	public static void main(String[] args) {
		
		int nums[] = {1,2,3,4,5,6,7};
		int length = nums.length;
		arraysShuffle(nums,length);
		
	}

	public static void arraysShuffle(int[] nums, int length) {

		Random r = new Random();
		
		for(int i =  length - 1;i>0;i--) {
			int j = r.nextInt(i+1);
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j]=temp;
		}
		System.out.println(Arrays.toString(nums));
	}
}
