package com.mahesh.threads;

public class StringTest {
	public static void main(String[] args) {
		String s = "abc";
		String s2 = new String("abc");
		
		System.out.println(s==s2);
		
		method(null);
	}

	private static void method(Object object) {
		System.out.println("Hi from object");
		
	}
	
	private static void method(String object) {
		System.out.println("Hi from String");
		
	}

}
