package com.prowings.innerclass;

public class TestMemberOuter {

	private int data = 30;
		
	class Inner{
			void msg()
			{
				System.out.println("data is:" +data);
			}
		}
	void display() {
		Inner in = new Inner();
		in.msg();
	}
	public static void main(String[] args) {
		
		TestMemberOuter obj = new TestMemberOuter();
		obj.display();
	}
}
