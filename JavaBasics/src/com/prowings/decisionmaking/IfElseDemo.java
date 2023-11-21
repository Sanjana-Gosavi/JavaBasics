package com.prowings.decisionmaking;

import java.util.Scanner;

public class IfElseDemo {

	public static void numberRecognizer()
	{
			int n;
			System.out.println("Enter the number");
			
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			
			
			if(n >= 0)
			{
				System.out.println("Positive Number");
			}
			else 
			{
				System.out.println("Negative Number");
		}
			
	}
	
	public static void main(String args[])
	{
		numberRecognizer();
		
	
	}
}
