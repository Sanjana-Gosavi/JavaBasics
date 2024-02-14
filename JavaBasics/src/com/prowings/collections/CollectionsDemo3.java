package com.prowings.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(87);
		al.add(4);
		al.add(22);
		al.add(62);
		
		System.out.println("Before Shuffle:"+al);
		Collections.shuffle(al);
		System.out.println("After Shuffle:" +al);
		
		Collections.swap(al, 1, 4);
		System.out.println("After Swap:"+al);
		
		Collections.fill(al, 10);
		System.out.println("After fill:"+al);
		
		
	}
}
