package com.prowings.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		
		TreeSet<String> tree = new TreeSet<>();
		tree.add("zzz");
		tree.add("nnn");
		tree.add("aaa");
		tree.add("ggg");
		tree.add("bbb");
		
		System.out.println(tree);
		
		System.out.println("First Element: " +tree.first());
		System.out.println("Last Element: " +tree.last());
		System.out.println("HeadSet(): "+tree.headSet("nnn"));
		System.out.println("TailSet(): "+tree.tailSet("nnn"));
	}
}
