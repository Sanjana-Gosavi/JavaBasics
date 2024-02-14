package com.prowings.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListAddElements2 {

	public static void main(String[] args) {
		
		ArrayList colors = new ArrayList();
		
		colors.add("Pink");
		colors.add("Black");
		colors.add("White");
		colors.add("Yellow");
		colors.add("Brown");
		
		System.out.println("ArrayList of colors is:" +colors);
		 colors.add(0, "Red");
		System.out.println("ArrayList of colors is:" +colors);
		
		System.out.println(colors.get(2));	
		
		colors.set(1, "Purple");
		System.out.println(colors);
		
		colors.remove(1);
		System.out.println(colors);
		
		System.out.println(colors.contains("Red"));
		
		
		Collections.sort(colors);
		System.out.println(colors);
		
		
	}
}
