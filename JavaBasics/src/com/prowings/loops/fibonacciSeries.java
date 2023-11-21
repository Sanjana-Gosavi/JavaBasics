package com.prowings.loops;
import java.util.Scanner;


public class fibonacciSeries {

	static int a = 0, b = 1, c, n;
	
	public static void fibonacci()
	{
		for(int i = 0; i < n; i++)
		{
			System.out.println("a=" +a);
			System.out.println("b=" +b);
			c = a + b;
			System.out.println(c);
			
			a = b;
			b = c;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		n = sc.nextInt();
		
		fibonacci();
		
	}
}
