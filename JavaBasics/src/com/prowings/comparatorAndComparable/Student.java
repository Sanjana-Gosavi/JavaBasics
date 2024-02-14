package com.prowings.comparatorAndComparable;

public class Student implements Comparable<Student>{

	private int rollNo;
	private String name;
	private String address;

	public Student() {
		super();
	}

	public Student(int rollNo, String name, String address) {
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "Student [RollNo = " + rollNo + " Name = " + name + " Address = " + address + "]";
	}

	public int compareTo(Student std) {

		return this.getName().compareTo(std.getName());
		
	}

//	public int compareTo(Object o) {
//		Student std = (Student)o;
//		if(std.getRollNo() == this.getRollNo())
//			return 0;
//		else if(std.getRollNo() < this.getRollNo())
//			return 3;
//		else
//			return -2;
//		
	

	

}
