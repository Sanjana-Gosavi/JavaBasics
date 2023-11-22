package com.prowings.stringmethods;

public class DuplicateRemoval {

	public static void main(String[] args) {

		String s = "Sanjana";

		System.out.println("Input String is:" + s);

		System.out.println("After removing duplicates string is:" + removeDuplicateChars(s));
	}

	private static String removeDuplicateChars(String s) {

		char[] ch = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (ch[i] == ch[j])
					ch[j] = ' ';
			}
		}

		String res = new String(ch);
		res = res.replaceAll(" ", "");
		return res;
	}

	public DuplicateRemoval() {
	}

}
