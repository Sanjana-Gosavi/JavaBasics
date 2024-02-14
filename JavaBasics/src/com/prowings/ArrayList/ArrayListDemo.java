package com.prowings.ArrayList;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) throws Exception {
		
		ArrayList al = new ArrayList();
		System.out.println("Initial Capacity: "+getCapacity(al));
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		//al.add(11);
		System.out.println("Initial Capacity: "+getCapacity(al));
		
	}

	public static int getCapacity(ArrayList <?> l) throws Exception {
		
		Field dataField = ArrayList.class.getDeclaredField("elementData");
		dataField.setAccessible(true);
		return ((Object[])dataField.get(l)).length;
	}
}


//Runs till java 8 version