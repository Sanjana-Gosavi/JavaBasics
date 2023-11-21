package com.prowings.polymorphism;

public class Programmer extends Employee{
	
	private double salary;
	private double overTime;
	
	public Programmer()
	{
		
	}
	
	public Programmer(String name, double salary, double overTime)
	{
		super(name, "Programmer");
		this.salary = salary;
		this.overTime = overTime;
	}
	
	public double calculateSalary()	
	{
		return salary + overTime;
	}

	@Override
	public String toString() {
		return "Programmer salary=" + salary + ", overTime=" + overTime ;
	}

}
