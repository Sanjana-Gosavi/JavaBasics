package com.prowings.collections;

public class Student implements Comparable<Student>{

	private int id;
	private String name;
	private String address;
	
	public Student() {
		super();
	}
	
	public Student(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return "Student [Id = "+id+", Name= "+name+", Address= "+address+"]";
	}
//	public int compareTo(Student o) {
//		if(this.id == o.id)
//		return 0;
//		
//		else if(this.id > o.id)
//			return 1;
//		
//		else
//			return -1;
//	}

	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);	
	}

	
}
