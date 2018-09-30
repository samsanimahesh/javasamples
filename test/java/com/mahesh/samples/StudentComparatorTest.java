package com.mahesh.samples;

@RunWith(MockitoJunitRunner.class)
public class StudentComparatorTest {
	
	@Test
	public void test_student_comparator(){
		StudentComparator studentComparator =  new StudentComparator();
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
		
		int compareResult = studentComparator.compare(student, student2);
		Assert.assertEquals(compareResult,1);
	}
	
	

}
