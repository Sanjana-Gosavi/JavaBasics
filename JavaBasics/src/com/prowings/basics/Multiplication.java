package com.prowings.basics;

import java.util.Scanner;

public class Multiplication {
	public static void main(String args[])
	{
		int a, b, c, mul;
		System.out.println("Enter the Numbers:");
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		mul = a * b * c;
		System.out.println("Multiplication of numbers is:" +mul);
		
	}
}
