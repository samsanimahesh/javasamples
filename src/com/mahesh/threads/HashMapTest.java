package com.mahesh.threads;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		
		Map<String,String> mapTest = new HashMap<String,String>();
		
		System.out.println(mapTest.put("mahesh", "Mahesh"));
		
		System.out.println(mapTest.put("mahesh", "Babu"));
		System.out.println(mapTest.get("mahesh"));
		
	}

}
