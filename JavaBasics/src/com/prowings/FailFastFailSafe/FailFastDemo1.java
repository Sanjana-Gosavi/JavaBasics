package com.prowings.FailFastFailSafe;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class FailFastDemo1 {

	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(1);
		vector.add(5);
		vector.add(3);
		
		System.out.println(vector);
		Iterator itr = vector.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			vector.add(4);
		}
	}
}
