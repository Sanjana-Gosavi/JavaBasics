package com.prowings.Vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector vector = new Vector();
		vector.add(12);
		vector.add("Hello");
		vector.add(34);
		vector.add("Hii");
		
		
		System.out.println(vector);
	
		System.out.println("Element At:"+vector.elementAt(1));
		System.out.println("First Element:" +vector.firstElement());
		System.out.println("Last Element:" +vector.lastElement());
		
		vector.setElementAt("Java", 3);
		System.out.println("Set Element:" +vector);

		vector.removeElement("Hello");
		System.out.println("Remove element:" +vector);
	
		vector.addElement("Hello");
		System.out.println("Add Element:" +vector);
		
		vector.insertElementAt("Programming", 4);
		System.out.println("Insert Element:" +vector);
		
		
	}
	
}
