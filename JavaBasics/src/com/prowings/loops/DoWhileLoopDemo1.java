package com.prowings.loops;

public class DoWhileLoopDemo1 {

	public static void main(String[] args) {
		
		sumUsingDoWhileLoop();
	}
	
	public static int sumUsingDoWhileLoop() {
		
		int no = 21;
		int sum = 0;
		
		do
		{
			sum += no;
			no--;
		}while(no > 2);
		
		System.out.println(sum);
		return sum;
	}
	
	
}
