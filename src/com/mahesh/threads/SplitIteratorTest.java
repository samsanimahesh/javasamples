package com.mahesh.threads;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SplitIteratorTest {
	public static void main(String[] args) {
		Set<String> splitSet = new LinkedHashSet<String>();
		splitSet.add(null);
		splitSet.add("mahesh");
		splitSet.add("babu");
		splitSet.add("samsani");
		splitSet.add("deepu");
		splitSet.add("madhu");
		for(String str : splitSet){
			System.out.println(str);
		}
		
		
		System.out.println("");
		Set<String> set = new HashSet<String>();
		set.add("mahesh");
		set.add("babu");
		set.add("samsani");
		for(String str : set){
			System.out.println(str);
		}
		
		
		NavigableSet<Integer> navSet = new TreeSet<Integer>();
		navSet.add(1);
		navSet.add(2);
		navSet.add(9);
		navSet.add(6);
		navSet.add(3);
		for(Integer nav : navSet){
			System.out.println(nav);
		}
		NavigableSet<Integer> partialSet = navSet.headSet(3, false);
		for(Integer nav : partialSet){
			System.out.println(nav);
		}
		
		System.out.println("removed is "+navSet.pollFirst());
		
		for(Integer nav : navSet){
			System.out.println(nav);
		}
		System.out.println(navSet.floor(7));
	}

}
