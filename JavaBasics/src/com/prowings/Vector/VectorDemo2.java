package com.prowings.Vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {
		
		Vector vector = new Vector();
		vector.add(12);
		vector.add(34);
		vector.add(56);
		vector.add(78);
		vector.add(34);
		
		Vector vector1 = new Vector();
		Integer[] arr = new Integer[4];
		
//		vector.copyInto(arr);
//		System.out.println("Elements of vector into arrays are:"+Arrays.toString(arr));
		
		vector.ensureCapacity(10);
		System.out.println("Capacity is:" +vector.capacity());
		
		vector.trimToSize();
		System.out.println(vector.capacity());
		
		System.out.println("Before setting Size:" +vector.size());
		vector.setSize(6);
		System.out.println("After setting size:" +vector.size());
		
		System.out.println("Vector is empty? " +vector.isEmpty());
		System.out.println("Vector is empty? " +vector1.isEmpty());
		
		System.out.println("Last Index of:" +vector.lastIndexOf(34));
		System.out.println("Last Index of:" +vector.lastIndexOf(12));
	}
	
}
