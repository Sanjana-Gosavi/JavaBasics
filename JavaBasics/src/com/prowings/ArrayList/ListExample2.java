package com.prowings.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class ListExample2 {

	
	public static void main(String[] args) {
	
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(10);
		al.add(456);
		al.add(789);
		
		System.out.println("Array List is:" +al);
		
		Integer[] nums = al.toArray(new Integer[0]);
		
		System.out.println("Array is:" +Arrays.toString(nums));
	}
}
