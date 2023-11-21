package com.prowings.abstraction;

public class Triangle extends Shape {
	
	double side;
	double base;
	double secSide;
	double height;
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Triangle(double side, double base, double secSide) {
		
		this.side=side;
		this.base=base;
		this.secSide=secSide;
	}

	
	public double getArea() {
		double area=(base*height)/2;
		return area;
	}


	public double getPerimeter() {
		double perimeter= side*base*secSide;
		return perimeter;
	}

	
}