package com.prowings.ArrayList;

import java.util.ArrayList;

public class ArrayListMethodDemo1 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(123);
		al.add("Hello");
		al.add(345);
		al.add("Hiii");
		al.add(789);
		
		System.out.println(al);
		
//		al.remove(0);
//		System.out.println(al);
//		al.removeAll(al);
//		System.out.println(al);

		System.out.println(al.contains(123));
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		
		
	}
	
}
