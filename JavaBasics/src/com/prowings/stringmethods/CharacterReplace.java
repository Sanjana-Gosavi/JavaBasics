package com.prowings.stringmethods;

import java.util.Scanner;

public class CharacterReplace {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String:");
		String s = sc.nextLine();

		System.out.println("Enter Character to be replace:");
		String toBeReplaced = sc.next();

		System.out.println("Enter the charecter to be reeplaced with:");
		String byReplacedWith = sc.next();

		System.out
				.println("String after replacing characters is:" + replaceCharacters(s, toBeReplaced, byReplacedWith));
	}

	public static String replaceCharacters(String s, String toBeReplaced, String byReplacedWith) {

//		s = s.replace(toBeReplaced, byReplacedWith);
//		return s;

		char[] chars = s.toCharArray();
		char replaced = toBeReplaced.charAt(0);
		char byReplaced = byReplacedWith.charAt(0);

		for (int i = 0; i < s.length(); i++) {
			if (chars[i] == replaced)
				chars[i] = byReplaced;
		}
		return new String(chars);
	}

	public CharacterReplace() {
	}

}
