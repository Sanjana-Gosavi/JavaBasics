package com.prowings.Vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo3 {

	public static void main(String[] args) {
		
		Vector vector = new Vector();
		vector.add(12);
		vector.add("Hello");
		vector.add(34);
		vector.add("Hii");
		
		
		System.out.println(vector);
		
		Enumeration enm = vector.elements();
		while(enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<");
	
		ListIterator ltr = vector.listIterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		
		
//		Iterator itr = vector.descendingIterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		
	}
	
}
