package com.prowings.basics;
import java.util.Scanner;

public class SwapNumber1 {
	public static void main(String args[])
	{
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Before Swapping");
		System.out.println("a=");
		a = sc.nextInt();
		
		System.out.println("b=");
		b = sc.nextInt();
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After Swapping");
		System.out.println("a= "+a);
		System.out.println("b=" +b);
	}

}
