package com.prowings.Arrays;

import java.util.Arrays;

public class MergeArray {
	public static void main(String[] args) {

	int[] nums1 = {10,20,30};
	int[] nums2 = {40,50};
	
	int[] result = mergeArrays(nums1, nums2);
	System.out.println("After merging two arrays" +Arrays.toString(result));
}

	public static int[] mergeArrays(int[] nums1, int[] nums2) {
		
		int[] nums3 = new int[nums1.length + nums2.length];
		
		int count = 0;
		for(int i = 0; i < nums1.length; i++)
		{
			nums3[count]= nums1[i];
			count++;
		}
		for(int j = 0; j < nums2.length; j++)
		{
			nums3[count] = nums2[j];
			count++; 
		}
		
		return nums3;
	}
	
	
	
}
