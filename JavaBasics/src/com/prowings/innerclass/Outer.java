package com.prowings.innerclass;

public class Outer {

	private int data = 30;
	
	class Inner{
		void msg() {
			System.out.println("Data is: "+data);
		}
	}
}
