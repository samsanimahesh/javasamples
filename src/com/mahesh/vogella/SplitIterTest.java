package com.mahesh.vogella;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SplitIterTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("mahesh");
		list.add("babu");
		list.add("samsani");
		Map<String,String> map = new HashMap<String,String>();
		map.put("123", "mahesh");
		map.put("234", "mahesh");
		map.put("345", "mahesh");
		map.putIfAbsent("123", "babu");
		System.out.println(map.getOrDefault("123", "samsani"));
		
	}

}
