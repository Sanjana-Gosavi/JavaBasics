package com.prowings.stringmethods;

public class PalindromeChecker {

	public PalindromeChecker() {
	}

	public static void main(String[] args) {
		String input = "MadaM";

		System.out.println(isPalindrome(input) ? "Palindrome" : "Not a Palindrome");
	}

	private static boolean isPalindrome(String s) {

		String reversedString = reverseString(s);
		return s.equals(reversedString);
	}

	public static String reverseString(String s1) {

		if (s1 == null)
			return null;

		String reverseString = "";

		for (int i = s1.length() - 1; i >= 0; i--) {
			reverseString += s1.charAt(i);

		}

		return reverseString;
	}

}
