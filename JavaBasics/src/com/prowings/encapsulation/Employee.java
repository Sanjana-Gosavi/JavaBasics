package com.prowings.encapsulation;

import java.util.Objects;

public class Employee {

	private int empId;
	private String name;
	
	public Employee()
	{
		
	}
	
	public Employee(int empId, String name)
	{
		this.empId = empId;
		this.name = name;
	}
	
	public int getEmpId()
	{
		return empId;
	}
	
	public void setEmpId(int empId)
	{
		this.empId = empId;
	}
	
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(empId, name);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		return empId == other.empId && Objects.equals(name, other.name);
//	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		return "Employee [Emp Id = " +empId+ " Emp Name = " +name+ "]";
	}
}
