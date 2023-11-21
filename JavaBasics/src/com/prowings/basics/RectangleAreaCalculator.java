package com.prowings.basics;

import java.util.Scanner;

public class RectangleAreaCalculator {
	
	public static void main(String args[])
	{
		int l, b;
		int area;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the lenth and breadth od rectangle:");
		l = sc.nextInt();
		b = sc.nextInt();
		
		area = l * b;
		System.out.println("Area of rectangle is:" +area);
		
	}

}