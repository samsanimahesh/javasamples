package com.mahesh.inheritance;

import java.util.HashMap;
import java.util.Map;

public class ImplementTest {

	public static void main(String[] args) {
		Map<Employee,Integer> employeeMap = new HashMap<Employee,Integer>();
		
		employeeMap.put(new Employee(1,1),10000);
		employeeMap.put(new Employee(1,1), 20000);
		System.out.println(employeeMap.size());
		
		for(Employee emp : employeeMap.keySet()){
			System.out.println(emp);
			System.out.println(employeeMap.get(emp));
		}
		
		System.out.println(employeeMap.get(new Employee(1,1)));
		
	}

}
