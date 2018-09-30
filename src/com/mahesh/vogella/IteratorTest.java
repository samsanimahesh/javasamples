package com.mahesh.vogella;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorTest {
	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<String>();
		
		for(int i=0;i<10;i++){
			list.add("abc"+i);
		}
		
		for(String str : list){
			if(str.contains("3")){
				list.remove(str);
			}
		}
		
		for(String str : list){
			System.out.println(str);
		}
	}

}
