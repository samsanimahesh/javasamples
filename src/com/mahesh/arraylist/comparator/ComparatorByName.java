package com.mahesh.arraylist.comparator;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Stud>{

	@Override
	public int compare(Stud stud1, Stud stud2) {
		return stud1.getName().compareTo(stud2.getName());
	}

}
