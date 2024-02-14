package com.prowings.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo6 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(10);
		al.add(50);
		
		Collections.synchronizedList(al);
		
		System.out.println("Original List:" +al);
		
		List<Integer> ls = myMethod(al);
		System.out.println(ls.set(0, 15));
		System.out.println(ls);
	}

	public static List<Integer> myMethod(ArrayList<Integer> al) {
		return Collections.unmodifiableList(al);
	}
}
