package com.prowings.innerclass;

public class TestNestedInterface implements Showable.Message {

	
	public void msg() {

		System.out.println("Hello Nested Interface");
	}

	public static void main(String[] args) {
		Showable.Message msg = new TestNestedInterface();
		msg.msg();
	}

}
