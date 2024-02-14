package com.prowings.ArrayList;

import java.util.Arrays;
import java.util.List;

public class ListExample {

	
	public static void main(String[] args) {
		
		Integer[] nums = {10, 20, 30, 40};
		
		List al = Arrays.asList(nums);
		System.out.println(al);
		
		
		Object[] numsConverted = al.toArray(new Integer[0]);
		System.out.println(Arrays.toString(numsConverted));
		
		for(Object o : numsConverted)
		{
			System.out.println((Integer)o);
		}
		
	}
}
