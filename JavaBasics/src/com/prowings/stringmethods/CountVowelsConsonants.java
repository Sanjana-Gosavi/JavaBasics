package com.prowings.stringmethods;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		String s1 = "helloworld";

		vowelCount(s1);
	}

	public static void vowelCount(String s1) {

		int vowel = 0;
		int consonants = 0;

		for (int i = 0; i < s1.length(); i++) {

			char current = s1.charAt(i);
			if (current >= 'a' && current <= 'z') {
				if (current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u') {
					vowel++;
				} else {
					consonants++;
				}
			}
		}
		System.out.println("Vowels are:" + vowel);
		System.out.println("Consonants are:" + consonants);

	}
}
