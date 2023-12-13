package com.prowings.cloning;

public class TestDeepCloning {

	public static void main(String[] args) {
		
		Address addr = new Address(412011, "Pune", "India");
		
		Employee emp1 = new Employee(10, "Ram", addr);
		
		Employee emp2 = null;
		
		try {
			emp2 = (Employee) emp1.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Error while cloning the objects");			
			e.printStackTrace();
		}
		
		System.out.println("Before changing Object:");
		System.out.println("Employee emp1 :" +emp1);
		System.out.println("Employee emp2 :" +emp2);
		
		emp1.setName("Sham");
		emp1.getAddress().setCity("Mumbai");
		System.out.println("After changing name:");
		System.out.println("Employee emp1 :" +emp1);
		System.out.println("Employee emp2 :" +emp2);
	}
}
