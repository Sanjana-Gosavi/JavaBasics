package com.prowings.stringmethods;

public class OccuranceOfSubstring {

	public OccuranceOfSubstring() {
	}

	public static void main(String[] args) {

		String s = "Welcome to java programming!!!";

		System.out.println("first occurance of substring is : " + occurance(s));

	}

	public static int occurance(String s) {

		return s.indexOf("java");
	}
}