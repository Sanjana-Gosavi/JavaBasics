package com.prowings.set;

import java.util.TreeSet;

public class TreeSetComparator {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(10, "Ram");
		Employee e2 = new Employee(20, "Sham");
		Employee e3 = new Employee(30, "Sachin");
		Employee e4 = new Employee(40, "Ajay");
		
		TreeSet set = new TreeSet<>(new EmployeeNameComparator());
		
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e1);
		
		System.out.println(set);
		
	}
}
