package com.prowings.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(24);
		al.add(9);
		al.add(90);
		al.add(65);
		al.add(34);
		al.add(12);
		
		System.out.println("Before sorting arraylist:"+al);
		Collections.sort(al);
		System.out.println("After sorting arraylist:"+al);
		
		
		Student s1 = new Student(10, "Ram", "Pune");
		Student s2 = new Student(20, "Sham", "Mumbai");
		Student s3 = new Student(30, "Sachin", "Kolhapur");
		
		Student[] stdarr= {s2, s3, s1};
		
		List<Student> stdal = Arrays.asList(stdarr);
		System.out.println("Before Sorting" +stdal);
		Collections.sort(stdal);
		System.out.println("After Sorting" +stdal);
		
	}
}
