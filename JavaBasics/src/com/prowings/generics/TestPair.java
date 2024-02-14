package com.prowings.generics;

public class TestPair {

	public static void main(String[] args) {
		
		Pair<String, Integer> p = new Pair<String, Integer>("aaa", 10);
		
		System.out.println(p.getKey());
		System.out.println(p.getValue());
		
		
		//Pair<Integer, Box<Integer>> p2 = new Pair<>();
		
		//p2.setKey("ABC");
		//p2.setValue(b);
		//System.out.println(p2.getKey());
		//System.out.println(p2.getValue());
	}
}
