package com.prowings.comparatorAndComparable;

public class Candidate {

	private int rollNo;
	private String name;
	private String address;

	public Candidate() {
		super();
	}

	public Candidate(int rollNo, String name, String address) {
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
		return "Candidate [RollNo = " + rollNo + ",Name = " + name + ",Address = " + address + "]";
	}

	
	

	

}
