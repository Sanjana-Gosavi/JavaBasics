package com.prowings.decisionmaking;
import java.util.Scanner;


public class LeapYear {
	
	public static void main(String[] args) {
		
		LeapYear l = new LeapYear();
		l.leapYear();
	}
	public void leapYear()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Year");
		int year = sc.nextInt();
		
		if(year % 4 == 0)
		{
			System.out.println("Leap Year");
		}
		else 
		{
			System.out.println("Not Leap year");
		}
	}
	

}
