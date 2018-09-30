package com.mahesh.threads;

public class ShallowCloneTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Mahesh");
		Address address = new Address();
		address.setCity("amalapura");
		address.setPincode("533201");
		address.setStreet("street");
		employee.setAddress(address);
		
		System.out.println(employee.getAddress().getPincode());
		
		Employee cloned = (Employee) employee.clone();
		System.out.println(cloned.getId());
		System.out.println(cloned.getName());
		System.out.println(cloned.getAddress().getPincode());
		cloned.getAddress().setPincode("77889");
		
		System.out.println(employee.getAddress().getPincode());
		System.out.println(cloned.getAddress().getPincode());
	}

}
