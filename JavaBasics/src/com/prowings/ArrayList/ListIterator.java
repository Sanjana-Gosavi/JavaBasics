package com.prowings.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ListIterator {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		
		Iterator itr = al.iterator();
		
		while (itr.hasNext()) {
			{
				System.out.println(itr.next());
			}
		}
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		
		java.util.ListIterator ltr = al.listIterator(3);
		
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
		
			
	}
}

