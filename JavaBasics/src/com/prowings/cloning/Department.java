package com.prowings.cloning;


public class Department implements Cloneable{

	private int noOfDepartments;
	private String nameOfDepartment;
	
	
	public Department() {
		super();
	}
	
	public Department(int noOfDepartments, String nameOfDepartment) {
		
		this.noOfDepartments = noOfDepartments;
		this.nameOfDepartment = nameOfDepartment;
	}
	
	public int getNoOfDepartments() {
		return noOfDepartments;
	}
	public void setNoOfDepartments(int noOfDepartments)
	{
		this.noOfDepartments = noOfDepartments;
	}
	
	public String getNameOfDepartment() {
		return nameOfDepartment;
	}
	public void setnameOfDepartment(String nameOfDepartment)
	{
		this.nameOfDepartment = nameOfDepartment;
	}
	
	public String toString() {
		return "Department [NoOfDepartments= "+noOfDepartments+ "NameOfDepartment= " +nameOfDepartment+ "]";
	}
	
	
	protected Object clone() throws CloneNotSupportedException{
		
		return super.clone();
		
	}
	
	
}

