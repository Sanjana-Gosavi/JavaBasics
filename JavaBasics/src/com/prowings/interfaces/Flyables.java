package com.prowings.interfaces;

public class Flyables {

	public static void main(String[] args) {
	
		Spacecraft s = new Spacecraft();
		s.flyObj();
		
		Airplane a = new Airplane();
		a.flyObj();
		
		Helicopter h = new Helicopter();
		h.flyObj();
}
}
