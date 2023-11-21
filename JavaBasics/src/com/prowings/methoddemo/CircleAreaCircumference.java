package com.prowings.methoddemo;

import java.util.Scanner;

public class CircleAreaCircumference {
	
	public double circleArea()
	{
		int radius;
		double area;
		double circ;
		
		double PI = 3.14;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle:");
		radius = sc.nextInt();
		
		area = PI * radius * radius;
		System.out.println("Area of circle is:" +area);
		
		circ = 2 * PI * radius;
		System.out.println("Circumference od circle is:" +circ);
		
		return area;
	}
	public static void main(String args[])
	{
		CircleAreaCircumference c = new CircleAreaCircumference();
		
		c.circleArea();
	}

}
