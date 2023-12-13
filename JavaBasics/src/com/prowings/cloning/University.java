package com.prowings.cloning;

public class University implements Cloneable{

	private String name;
	private Department dept;
	
	
	public University() {
		super();
	}
	
	public University(String name, Department dept)
	{
		this.name = name;
		this.dept = dept;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public Department getDept() {
		return dept;
	}
	
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	
	public String toString() {
		return "University [Name= " + name + "Department= " +dept+ "]";
	}
	
	protected Object clone()throws CloneNotSupportedException{
		
		University clonedUniversity = (University) super.clone();
		
		Department clonedDepartment = (Department)this.dept.clone();
		
		clonedUniversity.setDept(clonedDepartment);
		
		return clonedUniversity;
	}
}
