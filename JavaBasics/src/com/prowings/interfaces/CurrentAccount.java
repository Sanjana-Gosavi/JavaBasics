package com.prowings.interfaces;

public class CurrentAccount implements Account {

	private double balance;
	private double overDraftLimit;
	
	public CurrentAccount(double initialBalance, double overDraftLimit)
	{
		this.balance = initialBalance;
		this.overDraftLimit = overDraftLimit;
	}
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	public void withdraw(double amount)
	{
		if(balance + overDraftLimit >= amount)
		{
			balance = balance - amount;
		}
	}
	public double getBalance()
	{
		return balance;
	}
	public void setOverdraftLimit(double overDraftLimit)
	{
		this.overDraftLimit = overDraftLimit;
	}
	@Override
	public String toString() {
		return "CurrentAccount [balance=" + balance + ", overDraftLimit=" + overDraftLimit + "]";
	}
	
	
}
	

