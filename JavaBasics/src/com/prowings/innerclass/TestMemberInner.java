package com.prowings.innerclass;

public class TestMemberInner {

	public static void main(String[] args) {
		
		Outer obj = new Outer();
		Outer.Inner in = obj.new Inner();
		in.msg();
	}
}
