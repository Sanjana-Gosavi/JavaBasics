package com.prowings.oopsconcepts;

public class ChildSingleInheritance extends ParentSingleInheritance{
	
	public void m2()
	{
		System.out.println("Inside Child's m2()");
	}

	public static void main(String[] args) {
		
		ChildSingleInheritance c = new ChildSingleInheritance();
		
		c.m1();
		c.m2();
	}
}
