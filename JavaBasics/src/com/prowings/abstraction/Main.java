package com.prowings.abstraction;

public class Main {

	public static void main(String[] args) {
		
		Circle ce=new Circle(10.0);
		Rectangle re= new Rectangle(4.0, 3.0);
		Triangle tr=new Triangle(3.0, 4.0, 5.0);

		System.out.println("Area IS: "+ ce.getArea()+ " Perimeter is: "+ce.getPerimeter());
		System.out.println("Area IS: "+ re.getArea()+ " Perimeter is: "+re.getPerimeter());
		System.out.println("Area IS: "+ tr.getArea()+ " Perimeter is: "+tr.getPerimeter());
	}

}