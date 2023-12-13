package com.prowings.immutableClass;

public final class Student1 {
	
	private final String name;
	private final int rollNo;
	private final Address address;
	
	
	public Student1() {
		this.rollNo = 0;
		this.name = "";
		this.address = new Address();
	}
	

	public String getName() {
		return name;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public Address getAddress() {
		Address dummyAddr = new Address();
		dummyAddr.setPin(this.address.getPin());
		dummyAddr.setCity(this.address.getCity());
		dummyAddr.setCountry(this.address.getCountry());
		
		return dummyAddr;
	}



	public Student1(String name, int rollNo, Address address) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		
		Address addrCopy = new Address();
		addrCopy.setPin(address.getPin());
		addrCopy.setCity(address.getCity());
		addrCopy.setCountry(address.getCity());
		
		this.address = addrCopy;
		
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", address=" + address + "]";
	}

}
