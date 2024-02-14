package com.prowings.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo4 {
	public static void main(String[] args) {
	
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(21);
		al.add(87);
		al.add(34);
		al.add(90);
		//al.add(31);
		
		ArrayList<Integer> copyList = new ArrayList<Integer>();
		copyList.add(90);
		copyList.add(76);
		copyList.add(59);
		copyList.add(32);
		copyList.add(40);
		
		Collections.copy(copyList, al);
		
		System.out.println("Copied List:" +copyList);//copies all element from list
	}
}
