package com.prowings.generics;

public class Box <T> {

	private T t;
	
	public void setT(T t) {
		this.t = t;
	}
	
	public T getT() {
		return t;
	}
}
