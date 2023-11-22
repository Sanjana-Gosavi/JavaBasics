package com.prowings.stringmethods;

import java.util.Arrays;

public class AnagramChecker {

	public static void main(String[] args) {

		String s1 = "sure";
		String s2 = "care";

		System.out.println(s1);
		System.out.println(s2);

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		if (isAnagram(s1, s2))
			System.out.println("Both strings are anagrams of each other!!");
		else
			System.out.println("Both strings are not anagrams of each other!!");

	}

	public static boolean isAnagram(String s1, String s2) {

		s1 = s1.replaceAll(" ", "");
		s2 = s2.replaceAll(" ", "");

		if (s1.length() != s2.length())
			return false;

		char[] str1 = s1.toCharArray();
		char[] str2 = s2.toCharArray();

		Arrays.sort(str1);
		Arrays.sort(str2);

		return Arrays.equals(str1, str2);

	}

	public AnagramChecker() {

	}

}
