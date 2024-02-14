package com.prowings.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("ppp", 8);
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		hm.put("aaa", 1);
		hm.put("bbb", 2);
		hm.put("aaa", 3);
		hm.put("ccc", 4);
		hm.put("ddd", 5);
		hm.put("bbb", 6);
		System.out.println("Hashmap is:"+hm);
		
		System.out.println("Size of Hashmap is:"+hm.size());
		
		System.out.println("Get Value:"+hm.get("ddd"));
		
		System.out.println("Contains Key sss:" +hm.containsKey("sss"));
		
		hm.put("zzz", 7);
		System.out.println("After putting Key value pair:" +hm);
		
		hm.putAll(map);
		System.out.println("Put All" +hm);
		
		hm.remove("aaa");
		System.out.println("After remove:" +hm);
		
		//hm.containsValue(2);
		System.out.println("ContainsValue: "+hm.containsValue(6));
		
		System.out.println("Hashcode:"+hm.hashCode());
	}
}
