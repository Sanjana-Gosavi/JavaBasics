package com.prowings.Map;

import java.util.Objects;

public class Car {

	private String company;
	private int makeYear;

	public Car(String company, int makeYear) {
		super();
		this.company = company;
		this.makeYear = makeYear;
	}

	@Override
	public int hashCode() {
		return Objects.hash(company, makeYear);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(company, other.company) && makeYear == other.makeYear;
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", makeYear=" + makeYear + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called on:" +this);		
		super.finalize();
	}
	
	
}
