package com.prowings.methoddemo;

import java.util.Scanner;

public class ModuloOperation {
	
	static int a;
	static int res;
	
	public static int modulo()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		a = sc.nextInt();
		
		res = a % 10;
		System.out.println("Result=" +res);
		
		return res;
	}
	public static void main(String args[])
	{
		modulo();
	}
}
