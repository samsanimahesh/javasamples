package com.mahesh.rest;


@URL("http://localhost:8080/StudentController")
public class RestController {
	@URL("/getStudentDetails")
	@param(id)
	public void getStudent(int id){
		//logic related to geting info from id
	}
	
	
	@URL("/createStudent")
	@param(Student)
	public void createStudent(Student student){
		
	}

}
