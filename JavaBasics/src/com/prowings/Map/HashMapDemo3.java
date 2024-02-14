package com.prowings.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo3 {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("aaa", 1);
		hm.put("zzz", 9);
		hm.put("mmm", 6);
		hm.put("bbb", 2);
		
		for(Entry<String, Integer> e: hm.entrySet())
		{
			System.out.println(e.getKey()+" "+ e.getValue());
		}
		
		
	}

}
