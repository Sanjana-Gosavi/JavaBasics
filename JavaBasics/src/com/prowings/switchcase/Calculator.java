package com.prowings.switchcase;
import java.util.Scanner;

public class Calculator {
	
	static int a, b;
	static char choice;
	
	public static void calculator()
	{
			System.out.println("+");
			System.out.println("-");
			System.out.println("/");
			System.out.println("*");
			System.out.println("%");

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Choice:");
			choice = sc.next().charAt(0);
			
			System.out.println("Enter the numbers:");
			a = sc.nextInt();
			b = sc.nextInt();
			
			switch(choice)	
			{
			
			case '+':
				int add = a + b;
				System.out.println("Addition of numbers is " +add);
				break;
				
			case '-':
				int sub = a - b;
				System.out.println("Subtraction of numbers is "+sub);
				break;
				
			case '/':
				int div = a / b;
				System.out.println("Division of numbers is "+div);
				break;
				
			case '*':
				int mul = a * b;
				System.out.println("Multiplication of numbers is " +mul);
				break;
				
			case '%':
				int mod = a % b;
				System.out.println("Modulus of numbers is "+mod);
				break;
			
				default:
					System.out.println("Invalid Choice");
					break;
			}
					
		}
	public static void main(String[] args) {
		
		calculator();
	}
	

}
