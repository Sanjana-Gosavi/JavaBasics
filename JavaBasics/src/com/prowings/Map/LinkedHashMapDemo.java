package com.prowings.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("mmm", 89);
		map.put("sss", 90);
		
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>(map);
		lhm.put("aaa", 1);
		lhm.put("bbb", 2);
		lhm.put("ccc", 3);
		lhm.put("bbb", 4);
		lhm.put("ddd", 5);
		
		System.out.println(lhm);
		
		System.out.println("Size:" +lhm.size());
		
		
	}
}
		
