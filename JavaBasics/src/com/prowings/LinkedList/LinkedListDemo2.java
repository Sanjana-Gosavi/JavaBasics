package com.prowings.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.add(123);
		ll.add("Hello");
		ll.add(456);
		ll.add("Hii");
		
		System.out.println("Origional Linked List is:"+ll);
		
		System.out.println("Peek:"+ll.peek());		
		System.out.println("PeekFirst:"+ll.peekFirst());
		System.out.println("PeekLast:"+ll.peekLast());
		
		System.out.println("Poll:"+ll.poll());
		System.out.println("Linked list after performing Poll:" +ll);
		System.out.println("PollFirst:"+ll.pollFirst());
		System.out.println("PollLast:"+ll.pollLast());
		System.out.println("After performing poll function linked list is:"+ll);
		
		
	}
}
