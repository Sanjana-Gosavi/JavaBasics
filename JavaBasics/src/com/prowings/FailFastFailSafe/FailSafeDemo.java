package com.prowings.FailFastFailSafe;

import java.util.ArrayList;
import java.util.ListIterator;

public class FailSafeDemo {
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("aaa");
		arr.add("bbb");
		arr.add("ccc");
		arr.add("ddd");
		arr.add("aaa");
				
		ListIterator<String> ltr = arr.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
			ltr.add("eee");
		}
	}
	
}
