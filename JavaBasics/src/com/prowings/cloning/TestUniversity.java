package com.prowings.cloning;

public class TestUniversity {

	public static void main(String[] args) {
		
		Department dept = new Department(1, "Computer Science and Engineering");
		
		University uni1 = new University("Shivaji University", dept);
		
		University uni2 = null;
		
		try {
		uni2 = (University)uni1.clone();
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println("Error while cloning");
			
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println("Before changing");
		System.out.println(uni1);
		System.out.println(uni2);
		
		uni1.getDept().setnameOfDepartment("Inforamation Technology");
		
		System.out.println("After Changing");
		System.out.println(uni1);
		System.out.println(uni2);
	}
}
