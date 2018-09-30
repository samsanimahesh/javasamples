package com.mahesh.inheritance;

public class Employee {
	
	Employee(){
		
	}
	Employee(int id, int name){
		this.id=id;
		this.name=name;
	}
	
	private int id;
	private int name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	
	public int hashCode(){
		System.out.println("calling hashcode method");
		return id * 20;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Employee){
			Employee emp = (Employee)obj;
		boolean equals = (this.id==emp.id && this.name==emp.name);
		System.out.println(equals);
		return equals;
		}
		return false;
	}

}
