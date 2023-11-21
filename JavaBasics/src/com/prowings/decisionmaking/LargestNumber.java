package com.prowings.decisionmaking;

import java.util.Scanner;

public class LargestNumber {
	static int a, b, c;
	

	public static void greater()
	{
		if(a >= b)
	{
		if(a >= c)
		{
			System.out.println(+a +" is greater number");
		}
		else
		{
			System.out.println(+c + " is greater number");
		}
	}
	else
	{
		if(b >=  c)	
		{
			System.out.println(+b +" is greater number");
		}
		else
		{
			System.out.println(+c +" is greater number");
		}
	}
	}
	
	public static void smaller()
	{
		if(a <= b)
		{
			if(a <= c)
			{
				System.out.println(+a +" is smaller number");
			}
			else
			{
				System.out.println(+c + " is smaller number");
			}
		}
		else
		{
			if(b <=  c)	
			{
				System.out.println(+b +" is smaller number");
			}
			else
			{
				System.out.println(+c +" is smaller number");
			}
		}
	}
	public static void main(String[] args) {

		
		System.out.println("Enter the numbers:");
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		greater();
		smaller();
	}

}
