package com.prowings.loops;

public class AdditionOfNumbers {
	static int sum;
	
	public static void main(String[] args) {
		
		
		
		for(int i = 0; i <= 10; i++)
		{
			sum = i + sum;
			System.out.println(sum);
			
			
		}
		System.out.println("Addition of 1 to 10 numbers is " +sum);
			
	}
}
