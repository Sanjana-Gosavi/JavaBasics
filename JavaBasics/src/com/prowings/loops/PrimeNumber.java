package com.prowings.loops;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		num = sc.nextInt();
	
		if(isPrime(num))
		{
			System.out.println(num + " is prime number");
		}
		else
		{
			System.out.println(num+ " is not prime number");
		}
	}
	public static boolean isPrime(int n)
	{
		for(int i = 2; i < n/2; i++)
		{
			if(n % i == 0)
			{
				return false;
			}
		}
		return true;

	}
	
	
}
