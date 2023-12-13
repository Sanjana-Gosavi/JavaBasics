package com.prowings.copyconstructor;

public class TestEmployeeCopyConstructor {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(10, "Ram", "Pune");
		
		Employee emp2 = new Employee(emp1);
		
		System.out.println("Before Modification");
		System.out.println(emp1);
		System.out.println(emp2);
		
		System.out.println("After Modification");
		emp1.setAddress("Mumbai");
		
		System.out.println(emp1);
		System.out.println(emp2);
	}
}
