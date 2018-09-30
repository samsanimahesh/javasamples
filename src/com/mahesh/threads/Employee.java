package com.mahesh.threads;

public class Employee implements Cloneable{
	
	private int id;
	private String name;
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Object clone() {
		try{
			Address address = new Address();
			address.setCity(this.address.getCity());
			address.setPincode(this.address.getPincode());
			address.setStreet(this.address.getStreet());
			Employee student = (Employee)super.clone();
			student.setAddress(address);
			return student;
		}catch(CloneNotSupportedException e){
			System.out.println("Clone not supported");
		}
		return null;
	}
	
}
