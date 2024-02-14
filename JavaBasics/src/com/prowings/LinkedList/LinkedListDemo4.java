package com.prowings.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo4 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(12);
		al.add(34);
		System.out.println(al);
		
		LinkedList ll = new LinkedList(al);
		System.out.println(ll);
	}
	
}
