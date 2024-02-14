package com.prowings.collections;

import java.util.ArrayList;
import java.util.Collections;

import com.prowings.abstraction.Main;

public class CollectionsDemo2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(30);
		al.add(20);
		al.add(50);
		al.add(40);
		al.add(10);
		
//		System.out.println(al);
//		Collections.sort(al);
//		System.out.println("Sort():"+al);
		
//		int index = Collections.binarySearch(al,30);
//		System.out.println("Binary Search():"+index);
		
//		Collections.reverse(al);
//		System.out.println("Reverse():"+al);
		
		Person p1= new Person(54, "Ram");
		Person p2= new Person(87, "Sham");
		Person p3= new Person(65, "Sachin");
		
		ArrayList<Person> alPerson = new ArrayList<Person>();
		alPerson.add(p2);
		alPerson.add(p3);
		alPerson.add(p1);
		
		System.out.println("Before Sorting:"+alPerson);
		Collections.sort(alPerson, new PersonAgeComparator());
		System.out.println("After Sorting:" +alPerson);
		
		
	}
}
