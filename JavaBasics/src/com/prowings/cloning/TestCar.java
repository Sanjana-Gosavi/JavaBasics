package com.prowings.cloning;

public class TestCar {

	public static void main(String[] args) {
		
		Engine engine = new Engine(6, 10);
		
		Car car1 = new Car(4, "Suzuki", engine);
		
		Car car2 = null;
		
		try {
		car2 = (Car) car1.clone();
		}catch(CloneNotSupportedException e)
		{
			System.out.println("Error while cloning object");
			e.printStackTrace();
		}
		
		System.out.println("Before Changing Values:");
		System.out.println("Car car1 :" +car1);
		System.out.println("Car car2 :" +car2);

		car1.getEngine().setFualCapacity(15);
		System.out.println("After Changing values:");
		System.out.println("Car car1 :" +car1);
		System.out.println("Car car2 :" +car2);
		
	}
}
