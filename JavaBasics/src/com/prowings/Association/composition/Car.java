package com.prowings.Association.composition;

public class Car {
	
	String name;
	int model;
	Engine engine;
	
	

	public Car(String name, int model, Engine engine) {
		super();
		this.name = name;
		this.model = model;
		this.engine = engine;
	}
	
	public void startJourney()
	{
		if(engine != null)
		{
			if(engine.start()) {
				System.out.println("Car started moving!!");
			}
			else
			{
				System.out.println("Car can not start without engine");
			}
		}
	}


	public Car() {
		// TODO Auto-generated constructor stub
	}

}
