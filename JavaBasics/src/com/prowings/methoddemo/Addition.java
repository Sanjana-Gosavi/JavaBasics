package com.prowings.methoddemo;
import java.util.Scanner;

public class Addition {
	static int a;
	static int b;

	public static int addition()
	{
		int sum;

		sum = a + b;
		System.out.println("Addition of two numbers is:" +sum);
		return sum;
		
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		
		addition();
	}
}
