package com.prowings.innerclass;

public class TestAnnonymousInner {

	public static void main(String[] args) {

		Person p = new Person() {
			void eat() {
				System.out.println("Nice Fruits!!");
			}
		};
		p.eat();
	}
}
