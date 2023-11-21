package com.prowings.decisionmaking;
import java.util.Scanner;

public class InfosysHiring {
	
	static int age;
	static float experience;
	static int marks;
	
	public static void infosysHiring()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age:");
		age = sc.nextInt();
		
		System.out.println("enter the Experience:");
		experience = sc.nextFloat();
		
		System.out.println("Enter the 12th marks");
		marks = sc.nextInt();
		
		if(age >= 40 && experience >= 10 && marks >= 60)
		{
			System.out.println("Candidate id eligible for Job");
		}
		else
		{
			System.out.println("Candidate is not eligible for job");
		}
		
	}
	public static void main(String[] args) {
		infosysHiring();
	}
	

}
