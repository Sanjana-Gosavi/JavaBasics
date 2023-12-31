package com.prowings.copyconstructor;

public class Student {

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
	public Student(Student std) {
		
		this.rollNo = std.getRollNo();
		this.name = std.getName();
		this.address = std.address;
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
		return "Student [rollNo=" +rollNo+ " name=" +name+ " address= "+address+ "]";
	}
	
	
}
