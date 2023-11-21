package com.prowings.loops;

import java.util.Arrays;

public class EqualityOfTwoArrays {

	public static void main(String[] args) {
		int[] array1 = {2, 9, 8, 2, 7};
		int[] array2 = {2, 9, 6, 2, 7};
		
		System.out.println("Entered 1st array is:"+ Arrays.toString(array1));
		System.out.println("Entered 1st array is:"+ Arrays.toString(array2));
		
		boolean result = equalityOfArrays(array1, array2);
		System.out.println("Both arrays are equal? " +result);
	}
	
	public static boolean equalityOfArrays(int[] array12, int[] array22) {
	
	if(array12.length != array22.length) {
	 return false;
	}
	for(int i = 0; i < array12.length; i++)
	{
		if(array12[i] != array22[i])
		{
			return false;
		}
	}
	return true;
	}
}
	
