package com.prowings.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAddElements {

	public static void main(String[] args) {
		
		ArrayList al1 = new ArrayList();
		al1.add(1);
		al1.add("Hello");
		al1.add(2);
		al1.add("Hiii");
		al1.add(3);
		
		System.out.println(al1);
		
		ArrayList al2 = new ArrayList();
		al2.add(4);
		//al2.addAll(al1);
		//System.out.println(al1);
		
		System.out.println(al1.equals(al2));
		
		System.out.println(al1.hashCode());
		System.out.println(al2.hashCode());
		
		System.out.println(al2);
		
		ArrayList al3 = new ArrayList();
		al3 = (ArrayList) al1.clone();
		System.out.println(al3);
		
		al3.ensureCapacity(10);
		System.out.println(al3.size());
		
		al1.toArray();
		System.out.println(al1);
	}
}
