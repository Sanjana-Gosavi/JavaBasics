package com.prowings.immutableClass;

public final class Student {
	
	private final String name;
	private final int rollNo;
	private final String address;
	
	
	public Student() {
		this.rollNo = 0;
		this.name = "";
		this.address = "";
	}
	

	public String getName() {
		return name;
	}

	

	
	public int getRollNo() {
		return rollNo;
	}

	
	
	public String getAddress() {
		return address;
	}



	public Student(String name, int rollNo, String address) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", address=" + address + "]";
	}

}
