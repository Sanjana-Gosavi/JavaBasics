package com.prowings.oopsconcepts;

public abstract class C implements I {

	int i;
	
	public C(int i)
	{
		this.i = i;
		
	}
	
	
	public void m1()
	{
		System.out.println("This is Method m1");
		System.out.println(i);
	}
	
	public void m2()
	{
		System.out.println("This is Method m2");
		System.out.println(i);
	}
	
}
