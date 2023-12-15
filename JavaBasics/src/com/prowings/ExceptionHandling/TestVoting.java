package com.prowings.ExceptionHandling;

public class TestVoting {

	public static void main(String[] args) {
		System.out.println("Voting started!!");
		
		Voter voter1 = new Voter(18, "India");
		Voter voter2 = new Voter(18, "Bangladesh");
		Voter voter3 = new Voter(17, "India");
		Voter voter4 = new Voter(17, "Bangladesh");
		
		Voting voting = new Voting();
		voting.doVote(voter4);
		
		System.out.println("Voting Ended!!");
	}
}
