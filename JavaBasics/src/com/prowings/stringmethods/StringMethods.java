package com.prowings.stringmethods;

public class StringMethods {

	
	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "Programming";
		
		System.out.println("Length of String is:" +s1.length());
		System.out.println("is string empty? " +s1.isEmpty());
		System.out.println("is string blank? " +s2.isBlank());
		System.out.println("character at 2nd index is:" +s1.charAt(2));
		System.out.println("s1 is equal to s2? " +s1.equals(s2));
		System.out.println("Hashcode for string s1 is: " +s1.hashCode());
		
	}
	public StringMethods() {

	}

}
