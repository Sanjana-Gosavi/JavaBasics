package com.prowings.decisionmaking;
import java.util.Scanner;

public class EvenOdd {
	
	
	public static void main(String[] args) {
		evenOdd();
	
	}
	public static void evenOdd()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		if(number % 2 == 0)
		{
			System.out.println("Even number");
		}
		else 
		{
			System.out.println("Odd number");
		}
		
	}

}
