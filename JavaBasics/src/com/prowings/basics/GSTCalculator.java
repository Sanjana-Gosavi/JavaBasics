package com.prowings.basics;
import java.util.Scanner;

public class GSTCalculator {
	public static void main(String args[])
	{
		double netAmount;
		double gstAmount;
		double billAmount;
		//double gstPercentage;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Price:");
		billAmount = sc.nextDouble();
		
		gstAmount = (billAmount * 18) / 100;
		System.out.println("GST Amount is:" +gstAmount);
		
		netAmount = billAmount + gstAmount;
		System.out.println("Net Amount is:" +netAmount);
				
	}

}