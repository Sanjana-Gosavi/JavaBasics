package com.prowings.stringmethods;

public class ReplaceCharacter {

	public static void main(String[] args) {

		String s = "java programming!!";

		System.out.println("Origional String is:" + s);
		System.out.println("After replacing character:" + characterReplace(s));
		System.out.println("After replacing character:" + characterReplace1(s));

	}

	public static String characterReplace(String s) {

		s = s.replace('a', 's');

		return s;
	}

	public static String characterReplace1(String s) {

		char[] chars = s.toCharArray();
		char toBeRep = 'a';
		char repBy = 's';

		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == toBeRep)
				chars[i] = repBy;
		}
		return new String(chars);
	}

	public ReplaceCharacter() {
	}

}
