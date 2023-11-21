package com.prowings.loops;
import java.util.Scanner;

public class Fibonacci {
	
	public static void fibonacci()
	{
		int  n1 = 0, n2 = 1, n3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n = sc.nextInt();
		for(int i = 1; i <= n; ++i)
		{
			System.out.println(n1);
			
				n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
		}
		
	}
	public static void main(String[] args) {
		
		
		fibonacci();
		
	}

}
