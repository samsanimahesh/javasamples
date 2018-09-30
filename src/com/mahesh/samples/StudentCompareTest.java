package com.mahesh.samples;

import java.util.Set;
import java.util.TreeSet;

public class StudentCompareTest {
	public static void main(String[] args) {
		Student student = new Student();
		student.setId(1);
		student.setName("Mahesh");
		student.setAddress("amp");
		student.setGrade("grade 1");
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setName("Mahesh");
		student2.setAddress("amp");
		student2.setGrade("grade 2");
		
		Student student3 = new Student();
		student3.setId(3);
		student3.setName("Mahesh");
		student3.setAddress("amp");
		student3.setGrade("grade 3");
		
		Set<Student> studentList = new TreeSet<>(new StudentComparator());
		studentList.add(student3);
		studentList.add(student);
		studentList.add(student2);
		
		for(Student stud : studentList){
			System.out.println(stud.getId());
		}
		
		
	}

}
