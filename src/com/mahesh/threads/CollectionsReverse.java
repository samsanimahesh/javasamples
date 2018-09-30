package com.mahesh.threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsReverse {
	public static void main(String[] args) {
		List<String> listOfStrings = new ArrayList<String>();
		listOfStrings.add("mahesh");
		listOfStrings.add("babu");
		listOfStrings.add("samsani");
		Collections.sort(listOfStrings, new StringComparator());
		for(String str : listOfStrings){
			System.out.println(str);
		}
		
		
	}

}
