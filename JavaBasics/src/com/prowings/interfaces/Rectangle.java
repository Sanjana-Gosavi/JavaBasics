package com.prowings.interfaces;
import java.util.Scanner;


public class Rectangle implements Shape {
	
	public int width, height;
	public int areaOfRectangle;
	
	public void getArea()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the width");
		width = sc.nextInt();
		
		System.out.println("Enter the height");
		height = sc.nextInt();
		
		areaOfRectangle = width * height;
		
		System.out.println("Area of rectangle is:" +areaOfRectangle);
	}
	

}
