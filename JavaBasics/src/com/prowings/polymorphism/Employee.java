package com.prowings.polymorphism;

public class Employee {

	private String name;
	private String role;
	
	public Employee()
	{
		
	}
	
	public Employee(String name, String role)
	{
		this.name = name;
		this.role = role;
	}
	
	public String getName(String name)
	{
		return name;
	}
	
	public String getRole(String name)
	{
		return role;
	}
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setRole(String role)
	{
		this.role = role;
	}
	public double calculateSalary()
	{
		return 0.0;
	}
}
