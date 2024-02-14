package com.prowings.innerclass;

public class TestOuter2 {

	static int data = 30;
	
	static class Inner{
		static void msg() //static nested class that have static method
		{
			System.out.println("Data is:" +data);
		}
	}
	public static void main(String[] args) {
		
		TestOuter2.Inner.msg();
	}
}
