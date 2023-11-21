package com.prowings.loops;
import java.util.Scanner;

public class PositiveNegativeNumbersUsingArray {
	
	public static void positiveNegativeRecognizer()
	{
		Scanner in = new Scanner(System.in);
        int arr[] = new int[5];
        
        System.out.println("Enter 5 numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                System.out.print(arr[i] + ", ");
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0)
                System.out.print(arr[i] + ", ");
        }
    }
	
	public static void main(String[] args) {
		positiveNegativeRecognizer();
	}
	
}
