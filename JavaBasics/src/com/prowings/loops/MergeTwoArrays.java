package com.prowings.loops;

import java.util.Arrays;

public class MergeTwoArrays {
	
	public static void main(String[] args) {
		
		mergeTwoArrays();
	}

	public static void mergeTwoArrays() {
		
		int[] a = {1, 2, 3, 4};
		int[] b = {5, 6, 7};
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		int[] c = new int[a.length + b.length];
		
		for(int i = 0; i < a.length; i++)
		{
			c[i] = a[i];
		}
		
		for(int i = 0; i <b.length; i++)
		{
			c[i + a.length] = b[i];
		}
		System.out.println("After merging array is:" + Arrays.toString(c));
		
	}
		
}

