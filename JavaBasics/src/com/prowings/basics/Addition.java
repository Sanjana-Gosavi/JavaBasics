package com.prowings.basics;
import java.util.Scanner;


public class Addition {

	public static void main(String args[])
	{	
		int a;
		int b;
		int sum;
		System.out.println("Enter Two Numbers:");
		
		Scanner sc = new Scanner(System.in);
	
		a = sc.nextInt();
		b = sc.nextInt();
	
		sum = a + b;
	
		System.out.println("Addition of two numbers is:"+sum);
	
	}
}

