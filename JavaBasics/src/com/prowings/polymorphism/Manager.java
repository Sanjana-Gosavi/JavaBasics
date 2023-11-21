package com.prowings.polymorphism;

public class Manager extends Employee{
	
	private double basicSalary;
	private double bonus;
	
	public Manager()
	{
		
	}
	
	public Manager(String name, double basicSalary, double bonus)
	{
		super(name, "Manager");
		this.basicSalary = basicSalary;
		this.bonus = bonus;
		
	}
	
	public double calculateSalary()
	{
		return basicSalary + bonus;
	}

	@Override
	public String toString() {
		return "Manager basicSalary=" + basicSalary + ", bonus=" + bonus;
	}
	
	
}
