package com.prowings.Map;

import java.util.EnumMap;
import java.util.HashMap;

import com.prowings.enumumeration.Day;
import com.prowings.enumumeration.Size;

public class EnumMapDemo {
	
	public static void main(String[] args) {
		
		EnumMap<Day, Integer> eMap = new EnumMap<>(Day.class);
		
		eMap.put(Day.MONDAY, 1);
		eMap.put(Day.FRIDAY, 5);
		eMap.put(Day.WEDNESDAY, 3);
		eMap.put(Day.SUNDAY, 7);
		
		System.out.println(eMap);
		
		HashMap<Size, Integer> hm = new HashMap<>();
		hm.put(Size.SMALL, 28);
		hm.put(Size.MEDIUM, 32);
		hm.put(Size.LARGE, 40);
		
		EnumMap<Size, Integer> myMap = new EnumMap<Size, Integer>(hm);
		System.out.println(myMap);
		
		
	}

}
