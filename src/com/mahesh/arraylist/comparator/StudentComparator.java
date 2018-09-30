package com.mahesh.arraylist.comparator;

import java.util.Comparator;

public class StudentComparator implements Comparator<Stud>{


	@Override
	public int compare(Stud stud1, Stud stud2) {
		if(stud1.getId()<stud2.getId()){
			return -1;
		}else if(stud1.getId()>stud2.getId()){
			return 1;
		}else{
			return 0;
		}
	}

}
