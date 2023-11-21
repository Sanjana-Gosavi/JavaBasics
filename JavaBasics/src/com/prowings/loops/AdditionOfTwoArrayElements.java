package com.prowings.loops;

import java.util.Arrays;

public class AdditionOfTwoArrayElements {
	
	public static void main(String[] args) {
		
	int[] array1 = {3, 7, 5, 9, 5};
	int[] array2 = {4, 4, 3, 7, 1};
	
	System.out.println("Input array 1 is:" +Arrays.toString(array1));
	System.out.println("Input array 1 is:" +Arrays.toString(array2));

	
	int[] sumArray = additionOfTwoArrayElements(array1, array2);
	System.out.println("Addition of two array element is:" +Arrays.toString(sumArray));
	}

	public static int[] additionOfTwoArrayElements(int[] array1, int[] array2) {
		
		if(array1.length != array2.length)
		{
			System.out.println("Both arrays are not equals!!!");
			System.out.println("Please enter arrays of similar length!!");
		}
		
		int[] sumArray = new int[array1.length];
		
		for(int i = 0; i < array1.length; i++)
		{
			sumArray[i] = array1[i] + array2[i];
		}
		return sumArray;
	}
	
	

}
