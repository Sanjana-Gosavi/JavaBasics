package com.prowings.abstraction;

public class Circle extends Shape {
	
	double radius;
	
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Circle(double radius) {
		this.radius= radius;
		
	}
	
	public double getArea() {
		double area= 3.14*radius;
		return area;
	}

	public double getPerimeter() {
		double perimeter= 2*(3.14*radius);
		return perimeter;
	}
}