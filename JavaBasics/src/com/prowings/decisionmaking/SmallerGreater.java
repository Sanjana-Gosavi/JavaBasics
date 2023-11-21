package com.prowings.decisionmaking;
import java.util.Scanner;

public class SmallerGreater {
	
	public static void identifyGreater()
	{
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		if(a>b)
		{
			System.out.println(+a + " is greater than "+b);
		}
		else 
		{
			System.out.println(+b +" is greater than " +a);
		}
	}
	public static void identifySmaller()
	{
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		if(a<b)
		{
			System.out.println(+a + " is smaller than " +b);
		}
		else
		{
			System.out.println(+b +" is smaller than " +a);
		}
	}
	public static void main(String[] args) {
		
		identifyGreater();
		identifySmaller();
	}

}
