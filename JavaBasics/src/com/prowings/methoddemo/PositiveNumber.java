package com.prowings.methoddemo;
import java.util.Scanner;


public class PositiveNumber {
	
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
		
		

		/*
		 * int x =0xfac;
		 * 
		 * System.out.println(x);
		 * 
		 * 
		 * String a = "Durga"; int b = 10, c = 20, d= 30; System.out.println(a +b +c
		 * +d); System.out.println(b +c +d +a); System.out.println(b +c +a +d);
		 * System.out.println(b +a +c +d);
		 */

	
	
