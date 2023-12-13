package com.prowings.immutableClass;

public class Test1 {

	public static void main(String[] args) {
		
		Address address = new Address(123, "Pune", "India");
		
		Student1 s = new Student1("Ram", 20, address);
		
		address.setCity("Mumbai");
		System.out.println(s);
		
	}
}
