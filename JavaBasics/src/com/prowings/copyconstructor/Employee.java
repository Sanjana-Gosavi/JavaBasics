package com.prowings.copyconstructor;

public class Employee {

	private int id;
	private String name;
	private String address;
	
	
	public Employee() {
		super();
	}
	
	public Employee(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address =address;
	}
	
	public Employee(Employee emp) {
		this.id = emp.getId();
		this.name = emp.getName();
		this.address = emp.getAddress();
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
		return "Employee [Id= "+id+ " Name= "+name+ " Address= "+address+ "]";
	}
}
