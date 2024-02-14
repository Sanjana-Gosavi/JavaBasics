package com.prowings.comparatorAndComparable;

import java.util.Arrays;

public class ArraysSortOfObjects {

	public static void main(String[] args) {
		
		Student s4 = new Student(30, "DDD", "Pune");
		Student s3 = new Student(40, "CCC", "Pune");
		Student s1 = new Student(20, "AAA", "Pune");
		Student s2 = new Student(10, "BBB", "Pune");
		
		Student[] students = {s4,s1,s3,s2};
		
		Arrays.sort(students);
		System.out.println(Arrays.toString(students));
	

	Candidate c4 = new Candidate(30, "Ram", "Pune");
	Candidate c3 = new Candidate(40, "Sham", "Pune");
	Candidate c1 = new Candidate(20, "Sachin", "Pune");
	Candidate c2 = new Candidate(10, "Raju", "Pune");
	
	Candidate[] Candidates = {c4,c1,c3,c2};
	//Candidate obj = new Candidate();
	//Arrays.sort(Candidates , new CandidateNameComparator());
	
	Arrays.sort(Candidates, new CandidateRollNumberComparator2());
	System.out.println(Arrays.toString(Candidates));
	
	}
	
	
}
