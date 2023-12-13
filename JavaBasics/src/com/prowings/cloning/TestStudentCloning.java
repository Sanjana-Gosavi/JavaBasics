package com.prowings.cloning;

public class TestStudentCloning {

	public static void main(String[] args) {
		
		Student s1 = new Student(10, "Ram", "Pune");
		
		Student s2 = null;
		
		try {
			s2 = (Student) s1.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Error While Cloning objects");
			e.printStackTrace();
		}
		
		
		System.out.println("Before Changing objects");
		System.out.println("Student s1:" +s1);
		System.out.println("Student s2 :" +s2);
		
		s1.setName("Sham");
		
		System.out.println("After Changing objects");
		System.out.println("Student s1 :" +s1);
		System.out.println("Student s2 :" +s2);
	}
	
}
