package com.prowings.basics;
import java.util.Scanner;

public class SalaryAmountCalculator {
	public static void main(String args[])
	{
		double basicSal, HRA, DA, TA, netSal;
		double MA, PF;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Basic salary of Employee:");
		basicSal = sc.nextDouble();
		
		HRA = (basicSal * 45) / 100;
		System.out.println("House Rent Allowance is:" +HRA);
		
		DA = (basicSal * 30) / 100;
		System.out.println("Dearness Allowance is:" +DA);
		
		TA = (basicSal * 25) / 100;
		System.out.println("Travelling Allowance is: " +TA);
		
		MA = (basicSal * 5) / 100;
		System.out.println("Medical Allowance is: " +MA);
		
		PF = (basicSal * 25) / 100;
		System.out.println("Provident Fund is:" +PF);
		
		netSal = (basicSal + HRA + DA + TA) - (MA + PF);
		System.out.println("Net Salary of Employee is:" +netSal);
	}

}
