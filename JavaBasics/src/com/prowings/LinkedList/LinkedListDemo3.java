package com.prowings.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.add(123);
		ll.add("Hello");
		ll.add(456);
		ll.add("Hii");
		ll.add("Hii");
		ll.add("Hello");
		ll.add("Hello");
		ll.add("Hii");
		
		System.out.println("Origional Linked List is:" +ll);
		
		System.out.println("Pop:" +ll.pop());
		System.out.println("After Performing Pop:"+ll);
		
		ll.push("Java");
		System.out.println("After pushing element:" +ll);
		
		ll.removeFirstOccurrence("Hii");
		System.out.println("Remove First Occurance:" +ll);
		
		ll.removeLastOccurrence("Hello");
		System.out.println("Remove Last Occurance:" +ll);
		
		ll.removeFirst();
		System.out.println("Remove First:" +ll);
		
		ll.removeLast();
		System.out.println("Remove Last:" +ll);
		
		Iterator itr = ll.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		
		ListIterator ltr = ll.listIterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
	}
}
