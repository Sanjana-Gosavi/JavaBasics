package com.prowings.immutableClass;

public class Address {

	private int pin;
	private String city;
	private String Country;
	
	
	
	public Address() {
		super();
	}

	public Address(int pin, String city, String country) {
		super();
		this.pin = pin;
		this.city = city;
		Country = country;
	}

	
	
	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + ", Country=" + Country + "]";
	}
	
	
}
