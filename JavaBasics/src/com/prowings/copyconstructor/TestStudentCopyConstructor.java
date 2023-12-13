package com.prowings.copyconstructor;

public class TestStudentCopyConstructor {
	
	public static void main(String[] args) {
		
		Student std1 = new Student(10, "Ram", "Pune");
		
		Student std2 = new Student(std1);
		
		System.out.println("Before Modification");
		System.out.println(std1);
		System.out.println(std2);
		
		System.out.println("Before Modification");
		std1.setName("Sham");
		
		System.out.println(std1);
		System.out.println(std2);
		
	}

}
