package com.prowings.Map;

import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) {
		

		Car car1 = new Car("Suzuki", 1997);
		Car car2 = new Car("Altroz", 2021);
		Car car3 = new Car("Suzuki", 1997);
		Car car4 = new Car("Altroz", 2021);
		Car car5 = car2;
		
		WeakHashMap<Car, Integer> whm = new WeakHashMap<Car, Integer>();
		
		whm.put(car1, 1);
		whm.put(car2, 2);
		whm.put(car3, 3);
		whm.put(car4, 4);
		whm.put(car5, 5);
		
		System.out.println("Before GC:"+whm);
		
		car4 = null;
		System.gc();
		
		System.out.println("After GC:" +whm);
	}
}
