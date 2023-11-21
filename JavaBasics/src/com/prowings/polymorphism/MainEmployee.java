package com.prowings.polymorphism;

public class MainEmployee {

	public static void main(String[] args) {
		Employee e1 = new Manager("Sanjana",10000.0, 5000.0);
		Employee e2 = new Programmer("ABC",15000.0, 5000.0 );
		

		System.out.println(e1);
		System.out.println(e1.calculateSalary());
		System.out.println(e2);
		System.out.println(e2.calculateSalary());
	}
	
}
