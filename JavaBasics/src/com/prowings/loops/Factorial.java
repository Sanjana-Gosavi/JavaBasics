package com.prowings.loops;
import java.util.Scanner;

public class Factorial {
	
	static int fact = 1;
	static int n;

	public static void factorial()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++)
			fact = fact * i;
			
		System.out.println("Factorial of given numbers is:" +fact);
	}
	public static void main(String[] args) {
		factorial();
	}
}
