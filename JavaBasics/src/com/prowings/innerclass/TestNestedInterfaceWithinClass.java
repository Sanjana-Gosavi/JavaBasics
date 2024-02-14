package com.prowings.innerclass;

public class TestNestedInterfaceWithinClass implements A.Message {

	@Override
	public void msg() {
		System.out.println("Hello Nested Interface");
	}

	public static void main(String[] args) {

		A.Message msg = new TestNestedInterfaceWithinClass();
		msg.msg();
	}

}
