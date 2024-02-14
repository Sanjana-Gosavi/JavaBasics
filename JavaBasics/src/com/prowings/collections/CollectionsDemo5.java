package com.prowings.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo5 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(98);
		al.add(34);
		al.add(12);
		al.add(87);
		al.add(20);
		
		Integer min = Collections.min(al);
		System.out.println("Min():" +min);
		
		Integer max = Collections.max(al);
		System.out.println("Max():" +max);
		
		Collections.rotate(al, 2);
		System.out.println("rotate():"+al);
		
		if(Collections.replaceAll(al, 20, 30))
			System.out.println("After replaceAll():" +al);
		else
			System.out.println("Element can not be replaced!!");
		
	}
}
