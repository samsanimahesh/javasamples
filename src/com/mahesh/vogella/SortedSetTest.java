package com.mahesh.vogella;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedSetTest {
	public static void main(String[] args) {
		SortedMap<String,String> sortedMap = new TreeMap<String,String>();
		sortedMap.put("123", "mahesh");
		sortedMap.put("234", "babu");
		sortedMap.put("345", "samsani");
		
		sortedMap.keySet().forEach(key -> {
			System.out.println(sortedMap.getOrDefault(key, "exit"));
		});
	}

}
