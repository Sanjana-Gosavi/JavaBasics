package com.prowings.basics;

import java.util.Scanner;

public class LoanAmountCalculator {
	public static void main(String args[])
	{
		double loanAmount;
		double interestAmount;
		double totalAmount;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Loan Amount:");
		loanAmount = sc.nextDouble();
		
		interestAmount = (loanAmount * 12) / 100;
		System.out.println("Interest Amount is:" +interestAmount);
		
		totalAmount = loanAmount + interestAmount;
		System.out.println("Total Amount need to pay is:"+totalAmount);
	}
}
