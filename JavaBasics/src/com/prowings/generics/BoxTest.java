package com.prowings.generics;

public class BoxTest {

	public static void main(String[] args) {

		Box<Integer> b = new Box<Integer>();
			b.setT(10);

		Box<String> b1 = new Box<>();
			b1.setT("Hello");

			System.out.println(b.getT());
			System.out.println(b.getT().getClass().getName());
			System.out.println(b1.getT());
			System.out.println(b1.getT().getClass().getName());
			
	}
}
