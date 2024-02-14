package com.prowings.Map;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		
		Car car1 = new Car("Suzuki", 1997);
		Car car2 = new Car("Altroz", 2021);
		Car car3 = new Car("Suzuki", 1997);
		Car car4 = new Car("Altroz", 2021);
		Car car5 = car2;
		
		IdentityHashMap<Car, Integer> idhm = new IdentityHashMap<Car, Integer>();
		
		idhm.put(car1, 1);
		idhm.put(car2, 2);
		idhm.put(car3, 3);
		idhm.put(car4, 4);
		idhm.put(car5, 5);
		
		System.out.println("Identity HashMap:"+idhm);
		
		
		
		
		
	}
}
