package com.prowings.stringmethods;

public class StringReverse {
	
	public static void main(String[] args) {
		
		String s1 = "HelloWorld";
		System.out.println("Origional String is:" +s1);
		
		System.out.println("Reversed String is:" +reverseString(s1));
		
	}

	public static String reverseString(String s1) {
		
		if(s1 == null)
		return null;
		
		String reverseString = "";
		
		for(int i = s1.length()-1;i>=0;i--) {
			reverseString += s1.charAt(i);
		
		}
		
		return reverseString;
	}
	
	
	
	
}
