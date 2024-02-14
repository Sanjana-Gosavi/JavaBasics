package com.prowings.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseStringUsingCollections {

	public static void main(String[] args) {
		
		String reversedString = reverseString("Hello");
		System.out.println(reversedString);
	}

	public static String reverseString(String input) {

		char[] chars = input.toCharArray();
		
		List<Character> charsList = new ArrayList<>();
		for(char c : chars)
			charsList.add(c);
		
		Collections.reverse(charsList);
		
		
		char[] charsArr = new char[charsList.size()];
		int index = 0;
		
		for(Character c : charsList) {
			
			charsArr[index] = c;
			index++;
		}
		
		
		return new String(charsArr);
	}
}
