package com.prowings.abstraction;

public class Rectangle extends Shape {

	double length;
	double width;
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(double lenght, double width) {
		
		this.length= lenght;
		this.width=width;
	}
	
	public double getArea() {
		double area=length*length;
		return area;
	}

	
	public double getPerimeter() {
		double perimeter= 2*(length*width);
		return perimeter;
	}
}
