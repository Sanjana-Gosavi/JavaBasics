package com.prowings.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.add(123);
		ll.add("Hello");
		ll.add(456);
		ll.add("Hii");
		
		System.out.println("Origional Linked List is:"+ll);
		
		ll.addFirst("aaa");
		ll.addLast("zzz");
		
		System.out.println("After adding first and last element:"+ll);
		
		System.out.println(ll.element());
		System.out.println(ll);
		
		System.out.println("After getting first element:"+ll.getFirst());
		System.out.println("After getting Last element:"+ll.getLast());
		
		ll.offer(789);	
		ll.offerFirst("Java");
		ll.offerLast("Programming");
		System.out.println("After performing offer methods:"+ll);
		
		
	}
}
