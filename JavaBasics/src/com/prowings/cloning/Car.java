package com.prowings.cloning;

public class Car implements Cloneable {

	private int noOfWheels;
	private String modelName;
	private Engine engine;
	
	
	public Car() {
		super();
	}
	
	public Car(int noOfWheels, String modelName, Engine engine) {
		
		this.noOfWheels = noOfWheels;
		this.modelName = modelName;
		this.engine = engine;
	}
	
	public int getNoOfwheels()
	{
		return noOfWheels;
	}
	
	public void setNoOfWheels() {
		this.noOfWheels = noOfWheels;
	}

	public String getModelName() {
		return modelName;
	}
	
	public void setModelName() {
		this.modelName = modelName;
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public String toString() {
		return "Car [noOfWheels=" + noOfWheels + " modelName=" + modelName + " Engine=" +engine+ "]";
	}
	
	protected Object clone() throws CloneNotSupportedException {
		
		Car clonedCar = (Car) super.clone();
		Engine clonedEngine = (Engine) this.engine.clone();
		
		clonedCar.setEngine(clonedEngine);
		
		
		return clonedCar;
	}
}
