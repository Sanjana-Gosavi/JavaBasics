package com.prowings.cloning;

import com.prowings.oopsconcepts.Super;

public class Engine implements Cloneable{

	private int noOfCylinders;
	private int fualCapacity;
	
	public Engine()
	{
		super();
	}
	
	public Engine(int noOfCylinders, int fualCapacity)
	{
		this.fualCapacity = fualCapacity;
		this.noOfCylinders = noOfCylinders;
	}
	
	public int getNoOfCylinders() {
		return noOfCylinders;
	}
	
	public void setNoOfCylinders(int nnoOfCylinders) {
		this.noOfCylinders = noOfCylinders;
	}
	
	public int getFualCapacity() {
		return fualCapacity;
	}
	
	public void setFualCapacity(int fualCapacity) {
		this.fualCapacity = fualCapacity;
	}
	
	public String toString() {
		 return "Engine [noOfCylinders=" + noOfCylinders + " fualCapacity=" + fualCapacity +"]";
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
		 
}
	

