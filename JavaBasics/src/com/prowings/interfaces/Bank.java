package com.prowings.interfaces;

public class Bank {

	public static void main(String[] args) {
		
		SavingAccounts s = new SavingAccounts(1500.0,1.25);
		
		s.deposit(500);
		s.getBalance();
		s.withdraw(200);
		
		CurrentAccount c = new CurrentAccount(5000.0, 1000.0);
		c.deposit(200);
		c.withdraw(100);
		c.getBalance();
		
		System.out.println(s);
		System.out.println(c);
		
	}
}
