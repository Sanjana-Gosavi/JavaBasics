package com.prowings.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(198);
		hs.add(22);
		hs.add(25);
		hs.add(45);
		hs.add(13);
		hs.add(22);
		hs.add(25);
		
		System.out.println(hs);
		System.out.println("Size:" +hs.size());
		
		System.out.println("Contains 1: " +hs.contains(1));
		
		System.out.println(Arrays.toString(hs.toArray()));
		hs.add(67);
		System.out.println("After inserting element:"+hs);
		hs.remove(22);
		System.out.println("After removing element:" +hs);
		
//		hs.clear();
//		System.out.println(hs);
		
		System.out.println("Hashcode of hashmap:" +hs.hashCode());
		
	}
}
