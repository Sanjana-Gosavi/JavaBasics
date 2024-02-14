package com.prowings.FailFastFailSafe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FailFastDemo2 {

	public static void main(String[] args) {
		
		List<String> lst = new LinkedList<String>();
		
		lst.add("aaa");
		lst.add("bbb");
		lst.add("ccc");
		lst.add("ddd");
		lst.add("zzz");
		
		System.out.println("Given list is:" +lst);
		
		Iterator<String> itr = lst.iterator();
		while(itr.hasNext())
		{
//			String s = itr.next();
//			if(s.equals("ddd"))
//				lst.remove("aaa");
//			itr.next();
			System.out.println(itr.next());
			lst.remove(1);
		}
		System.out.println("Given list is:" +lst);
	}
}
