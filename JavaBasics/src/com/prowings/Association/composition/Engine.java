package com.prowings.Association.composition;

public class Engine {
	
	String name;
	boolean fual;
	boolean engineOil;
	
	

	public Engine(String name, boolean fual, boolean engineOil) {
		super();
		this.name = name;
		this.fual = fual;
		this.engineOil = engineOil;
	}



	public Engine() {
		super();	
	}
	
	public boolean start()
	{
		if(fual && engineOil)
		{
			System.out.println("Engine Started!!!");
			return true;
		}
		else
		{
			System.out.println("Engine can not started without fual or engine");
			return false;
		}
		
	}

}
