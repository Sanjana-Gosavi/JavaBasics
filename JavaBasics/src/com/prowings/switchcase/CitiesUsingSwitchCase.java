package com.prowings.switchcase;
import java.util.Scanner;

public class CitiesUsingSwitchCase {

	
//	static int choice;
	
	public static void cities()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Kolhapur");
		System.out.println("Pune");
		System.out.println("Satara");
		System.out.println("Mumbai");
				
		System.out.println("Enter your choice");
		String choice = sc.next();
		
		switch(choice)
		{
		case "Kolhapur":
			System.out.println("Kolhapur is known as 'Dakshin Kashi' or Kashi of the South");
		break;
		
		case "Pune":
			System.out.println(" The city of Pune is part of Pune Metropolitan Region.");
		break;
			
		case "Satara":
			System.out.println("Satara is famous for the Kaas Plateau, Thoseghar, and a lot of natural sites.");
		break;
		
		case "Mumbai":
			System.out.println("Mumbai is the financial, commercial, and the entertainment capital of India.");
		break;
		
		
		default:
			System.out.println("City not found in out list");
			break;
		}
	}
		
	public static void main(String args[])
	{
		cities();
	}
	
		
	
}
