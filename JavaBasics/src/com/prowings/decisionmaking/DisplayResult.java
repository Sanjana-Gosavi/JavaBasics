package com.prowings.decisionmaking;

import java.util.Scanner;

public class DisplayResult {

	static int marks;

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks:");
		marks = sc.nextInt();
		
		displayResult();
	}
		public static void displayResult()
		{
			if (marks < 40) 
			{
				System.out.println("Fail");
			} 
			else 
			{
				System.out.println("Pass");
			}
		}
}


