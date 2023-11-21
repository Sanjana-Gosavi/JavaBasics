package com.prowings.interfaces;
import java.util.Scanner;


public class Triangle implements Shape{

	public float base, height;
	public float areaOfTriangle;
	
	public void getArea() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base:");
		base = sc.nextFloat();
		
		System.out.println("Enter the height");
		height = sc.nextFloat();
		
		
		areaOfTriangle = (base * height)/2;
		
		System.out.println("Area of Triangle is: " +areaOfTriangle);
	}
	

}
