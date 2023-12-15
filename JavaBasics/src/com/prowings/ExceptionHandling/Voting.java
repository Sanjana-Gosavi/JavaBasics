package com.prowings.ExceptionHandling;

public class Voting {

//	public void doVote(Voter voter) {
//		if((voter.getAge() >= 18)&& (voter.getCountry().equalsIgnoreCase("India"))){
//			System.out.println("Candidate is eligible for vote");
//		}
//		else
//		{
//			throw new InvalidAgeException("Voter is not eligible for vote");
//		}
//	}
	
	
	
	public void doVote(Voter voter) {
		if(voter.getAge() >= 18) {
			if((voter.getCountry().equalsIgnoreCase("India")))
			System.out.println("Candidate is eligible for vote");
		
		
			else
				throw new InvalidCitizenException("Voter is not from India");
		}
		else
		{
			throw new InvalidAgeException("Voter is under age");
		}
	}
}
