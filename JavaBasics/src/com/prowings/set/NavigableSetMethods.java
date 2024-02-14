package com.prowings.set;

import java.util.Iterator;
import java.util.TreeSet;

public class NavigableSetMethods {

	public static void main(String[] args) {
		
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("hhh");
		tree.add("bbb");
		tree.add("mmm");
		tree.add("aaa");
		tree.add("zzz");
		
		System.out.println(tree);
		
		
		System.out.println("Lower(): " +tree.lower("mmm"));//greatest element in this set strictly less than the given element
		System.out.println("Higher():"+tree.higher("ccc"));//lowest element in this set strictly less than the given element
		System.out.println("Floor(): " +tree.floor("ccc"));//less than or equal to the given element
		System.out.println("Ceiling():" +tree.ceiling("mmm"));//greater than or equal to the given element
		
		//System.out.println("PollFirst():"+tree.pollFirst());//retrieves and remove first element in set
		//System.out.println("pollLast():"+tree.pollLast());//retrieves and removes last element in set
		
		Iterator itr = tree.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("DescendingSet():" +tree.descendingSet());
		//System.out.println("DescendingIterator():" +itr.descendingIterator());
		
		System.out.println("HeadSet():"+tree.headSet("hhh", false));
		System.out.println("TailSet():"+tree.tailSet("hhh", false));
		System.out.println("SubSet():" +tree.subSet("aaa", "mmm"));
		System.out.println("SubSet():" +tree.subSet("aaa", false, "mmm", false));
		
	}
}
