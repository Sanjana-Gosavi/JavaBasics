package com.prowings.basics;
import java.util.Scanner;

public class TriangleAreaCalculator{
	public static void main(String args[])
	{
		int b, h;
		int area;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base and height of triangle:");
		
		b = sc.nextInt();
		h= sc.nextInt();
		
		area = (b * h) / 2;
		System.out.println("Area of triangle is:" +area);
		
	}

}
 