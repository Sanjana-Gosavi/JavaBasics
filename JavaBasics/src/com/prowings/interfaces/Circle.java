package com.prowings.interfaces;
import java.util.Scanner;


public class Circle implements Shape {
	
	public float radius;
	public double PI = 3.14;
	public double areaOfCircle;
	
	Scanner sc = new Scanner(System.in);
	public void getArea()
	{
		System.out.println("Enter radius of circle:");
		radius = sc.nextFloat();
		areaOfCircle = PI * radius * radius;
		
		System.out.println("Area Circle is:" +areaOfCircle);
	}

}
