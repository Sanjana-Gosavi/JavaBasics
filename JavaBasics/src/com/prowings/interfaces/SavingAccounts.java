package com.prowings.interfaces;

public class SavingAccounts implements Account{

	private double balance;
	private double interestRate;
	
	SavingAccounts(double balance, double interestRate)
	{
		this.balance = balance;
		this.interestRate = interestRate;
		
	}
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	
	public void withdraw(double amount)
	{
		balance = balance - amount;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void applyInterest()
	{
		balance = balance + balance * interestRate/100;
	}
	@Override
	public String toString() {
		return "SavingAccounts [balance=" + balance + ", interestRate=" + interestRate + "]";
	}
	
	
}
