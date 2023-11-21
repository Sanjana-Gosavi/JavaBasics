package com.prowings.decisionmaking;
import java.util.Scanner;

public class GredeCalculator2 {
	
	
	public static String gradeCalculator(int[] marks)
	{
		
		float sum = 0.0f;
		for(int i=0;i<marks.length;i++)
				sum = sum + marks[i];
		System.out.println("Sum of marks is:" +sum);
		
		float avg = sum / marks.length;	
		System.out.println("Average of marks is:" +avg);
		
		
		if(avg < 40)
		{
			return "FAIL!!";
		}
		else if((avg >= 40 ) && (avg <= 60))
		{
			return "B Grade!!";		
		}
		else if((avg >= 61) && (avg <= 75))
		{
			return "A Grade!!";		
		}
//		else if((avg >= 76) && (avg <= 100))
//		{
//			return "Distinction!!";		}
//		}
		else
		{
			return "Distinction!!";		
		}	
	}
	
	public static void main(String[] args) {
		
		int[] marks = new int[5];
        
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks:");
		for(int i=0;i<5;i++)   
        {
            marks[i]=sc.nextInt();
        }
		
//		for(int i=0;i<5;i++)   
//        {
//			int mark = sc.nextInt();
//			if(mark > 0 && mark < 100)
//				marks[i]=mark;
//			else
//			{
//				System.out.println("Invalid Marks");
//			}

        
		
		String result = gradeCalculator(marks);
		System.out.println(result);
	}

}
