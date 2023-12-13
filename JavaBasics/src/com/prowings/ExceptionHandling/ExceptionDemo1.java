package com.prowings.ExceptionHandling;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		
		divide();
	}

	private static void divide() {
		
		try {	
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Number can not divided by zero!!");
		}
		finally
		{
			System.out.println("Finally block");
		}		
	}
}
