package com.prowings.decisionmaking;
import java.util.Scanner;

public class GredeCalculator {
	
	
	public static void gradeCalculator()
	{

		
		int marks[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks:");
		for(int i=0;i<5;i++)   
        {
            marks[i]=sc.nextInt();
        }
        
		
		float sum = 0.0f;
		for(int i=0;i<marks.length;i++)
				sum = sum + marks[i];
		System.out.println("Sum of marks is:" +sum);
		
		float avg = sum / marks.length;	
		System.out.println("Average of marks is:" +avg);
		
		
		if(avg < 40)
		{
			System.out.println("FAIL!!!");
		}
		else if((avg >= 40 ) && (avg <= 60))
		{
			System.out.println("B Grade!!");
		}
		else if((avg >= 61) && (avg <= 75))
		{
			System.out.println("A Grade!!");
		}
		else if((avg >= 76) && (avg <= 100))
		{
			System.out.println("Distinction!!!");
		}
		else
		{
			System.out.println("Invalid marks!!");
		}	
	}
	
	public static void main(String[] args) {
		
		gradeCalculator();
	}

}
