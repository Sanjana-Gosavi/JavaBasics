package com.prowings.loops;

public class FactorialOf5 {

	static int fact = 1;
	public static void main(String[] args) {
		
		for(int i = 1;i <= 5; i++)
		{
			fact = fact * i;
			System.out.println(fact);
		}
		System.out.println("Factorial of first 5 numbers is:" +fact);
	}
}
