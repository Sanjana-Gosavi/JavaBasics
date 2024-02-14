package com.prowings.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapDemo2 {
	
	public static void main(String[] args) {
		
		TreeMap<String, Integer> hm = new TreeMap<>();
		hm.put("aaa", 1);
		hm.put("zzz", 9);
		hm.put("mmm", 6);
		hm.put("bbb", 2);
		
		HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
		hm1.put("sss", 3);
		hm1.put("ddd", 7);
		hm1.put("ggg", 87);
		hm1.put("jjj", 8);
		
		hm.putAll(hm1);
		
		System.out.println(hm);
		for(Entry<String, Integer> e: hm.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		System.out.println(hm.remove("jjj", 8));
		System.out.println(hm);
		
		System.out.println(hm.containsKey("aaa"));
	}

}
