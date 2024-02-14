package com.prowings.comparatorAndComparable;

import java.util.Comparator;

public class CandidateNameComparator implements Comparator<Candidate> {

	@Override
	public int compare(Candidate c1, Candidate c2) {

		return c1.getName().compareTo(c2.getName());
	}

}
