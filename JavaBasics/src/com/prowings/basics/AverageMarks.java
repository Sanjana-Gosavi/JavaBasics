package com.prowings.basics;

import java.util.Scanner;

public class AverageMarks {
	
	public static void main(String args[])
	{
		int m1, m2, m3, m4, m5;
		int total;
		int avg;
	
		System.out.println("Enter the 5 subject's marks:");
	
		Scanner sc = new Scanner(System.in);
	
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		m4 = sc.nextInt();
		m5 = sc.nextInt();
	
		total = m1 + m2 + m3 + m4 + m5;
		System.out.println("Total of Marks is:" +total);
	
		avg = total/5;
		System.out.println("Average of marks is:"+avg);
	
	}

}