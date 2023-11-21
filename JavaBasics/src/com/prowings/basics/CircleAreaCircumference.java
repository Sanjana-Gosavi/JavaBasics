package com.prowings.basics;

import java.util.Scanner;

public class CircleAreaCircumference {
	public static void main(String args[])
	{
		double radius, area, Circumference;
		
		final double PI = 3.14;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius of circle:");
		radius = sc.nextInt();
		
		area = PI * radius * radius;
		System.out.println("Area of Circle:" +area);
		
		Circumference = 2 * PI * radius;
		System.out.println("Circumference of circle:" +Circumference);
	}
}
