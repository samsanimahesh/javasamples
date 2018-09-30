package com.mahesh.arraylist.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparatorTest {
	public static void main(String[] args) {
		Stud student = new Stud();
		student.setId(1);
		student.setName("def");
		student.setAddress("amp");
		
		Stud student2 = new Stud();
		student2.setId(2);
		student2.setName("ghi");
		student2.setAddress("amp");
		
		Stud student3 = new Stud();
		student3.setId(3);
		student3.setName("abc");
		student3.setAddress("amp");
		
		List<Stud> studentList = new ArrayList<Stud>();
		studentList.add(student3);
		studentList.add(student);
		studentList.add(student2);
		
		Collections.sort(studentList, new ComparatorByName());
		
		for(Stud stud : studentList){
			System.out.println(stud.getId());
		}
		
	}

}
