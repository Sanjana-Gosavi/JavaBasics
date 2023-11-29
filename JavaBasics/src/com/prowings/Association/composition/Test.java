package com.prowings.Association.composition;

public class Test {
	
	public static void main(String[] args) {
		
		Engine e = new Engine("Hyundai", true, true);
		Car c = new Car("Hyundai",2020, e);
		
		c.startJourney();
	}

	public Test() {
		// TODO Auto-generated constructor stub
	}

}
