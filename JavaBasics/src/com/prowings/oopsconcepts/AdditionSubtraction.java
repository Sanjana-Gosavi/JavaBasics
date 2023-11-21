package com.prowings.oopsconcepts;

public class AdditionSubtraction extends Calculator{

	public int addition(int a, int b)
	{
		int sum = a + b;
		
		System.out.println(sum);
		
		return sum;
		
		
	}

	@Override
	public int subtraction(int a, int b) {
		
		int sub = a - b;
		
		System.out.println(sub);
		
		return 0;
	}
	
	public static void main(String[] args) {
		
		AdditionSubtraction a = new AdditionSubtraction();
		
		a.addition(10, 20);
		
		a.subtraction(21, 1);
	}
	
}
