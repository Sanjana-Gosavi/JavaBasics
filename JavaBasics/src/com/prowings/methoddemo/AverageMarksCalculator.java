package com.prowings.methoddeemo;
import java.util.Scanner;

public class AverageMarksCalculator {
	
	public static int averageMarks()
	{
		int m1, m2, m3, m4, m5;
		int avg;
		int total;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 subject marks:");
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		m4 = sc.nextInt();
		m5 = sc.nextInt();

		
		total = m1 + m2 + m3 + m4 + m5;
		System.out.println("Total of 5 subjects is:	" +total);
		
		avg = total / 5;
		System.out.println("Average of Marks is:" +avg);
		
		return avg;
	}
	public static void main(String args[])
	{
		averageMarks();
	}

}
