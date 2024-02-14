package com.prowings.FailFastFailSafe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastDemo {

	public static void main(String[] args) {
		
		Map<String , Integer> map = new HashMap<String, Integer>();
		map.put("aaa", 1);
		map.put("bbb", 2);
		map.put("ccc", 3);
		map.put("ddd", 4);
		
		System.out.println(map);
		
		Iterator itr = map.keySet().iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
				map.put("eee", 5);
			}
	}
}
