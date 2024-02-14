package com.prowings.comparatorAndComparable;

import java.util.Comparator;

public class CandidateRollNumberComparator2 implements Comparator<Candidate> {

	@Override
	public int compare(Candidate c1, Candidate c2) {

		if (c1.getRollNo() == c2.getRollNo())
			return 0;
		else if (c1.getRollNo() > c2.getRollNo())
			return 3;
		else
			return -1;
	}

}
