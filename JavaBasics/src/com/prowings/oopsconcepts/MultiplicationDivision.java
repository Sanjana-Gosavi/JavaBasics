package com.prowings.oopsconcepts;

public class MultiplicationDivision implements Calculator1{

	@Override
	public int multiplication(int a, int b) {
		
		int mul = a * b;
		
		System.out.println(mul);
		
		return mul;
	}

	@Override
	public int division(int a, int b) {

		int div = a / b;
		
		System.out.println(div);
		
		return 0;
	}

	public static void main(String[] args) {
	
	MultiplicationDivision m = new MultiplicationDivision();
	
	m.multiplication(3, 7);
	
	m.division(21, 7);

	}
	
	
	
	
}
