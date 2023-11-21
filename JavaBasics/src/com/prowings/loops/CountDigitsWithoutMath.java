package com.prowings.loops;

import java.util.Scanner;

public class CountDigitsWithoutMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        long number = scanner.nextLong();
        
        int digitCount = countDigits(number);
        
        System.out.println("Total number of digits in the given number: " + digitCount);
        
        scanner.close();
    }
    
    public static int countDigits(long number) {
        if (number == 0) {
            return 1; // Special case for the number 0
        }
        
        int count = 0;
        
        // Ensure the number is non-negative
        if (number < 0) {
            number = -number;
        }
        
        // Convert the number to a string and count its length
        String numberStr = Long.toString(number);
        count = numberStr.length();
        
        return count;
    }
}
