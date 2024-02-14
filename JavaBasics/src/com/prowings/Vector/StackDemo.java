package com.prowings.Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackDemo {

	
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		stack.add("AAA");
		stack.add("BBB");
		stack.add("CCC");
		stack.add("DDD");
		
		System.out.println(stack);
		
		stack.push("EEE");
		System.out.println("After Pushing element into stack:"+stack);
		
		stack.pop();
		System.out.println("After deleting element from stack:"+stack);
		
		System.out.println("Peek:"+stack.peek());
		
		System.out.println("Empty stack?" +stack.empty());
		
		System.out.println("Serach:"+stack.search("BBB"));
		
		System.out.println("<<<<<<<<<<<<<Enumeration>>>>>>>>>>>>>");
		Enumeration enm = stack.elements();
		while(enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}
		
		System.out.println("<<<<<<<<<<<<<Iterator>>>>>>>>>>>>>");
		
		Iterator itr = stack.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("<<<<<<<<<<<<<ListIterator>>>>>>>>>>>>>");
		
//		ListIterator ltr = stack.listIterator();
//		while(ltr.hasNext())
//		{
//			System.out.println(ltr.next());
//		}
	}
}
