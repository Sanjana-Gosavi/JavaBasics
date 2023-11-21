package com.prowings.encapsulation;

public class EncapsulationDemoEmp {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		e.setEmpId(10);
		e.setName("Sanjana");
		
		System.out.println(e);
		
		Employee e1 = new Employee();
		e1.setEmpId(10);
		e1.setName("Sanjana");
		
		System.out.println(e1);
		
		
		boolean res = e.equals(e1);
		System.out.println(res);
		
		int hash = e1.hashCode();
		System.out.println(hash);
		
		int hash1 = e.hashCode();
		System.out.println(hash1);
 }
	
	
}
