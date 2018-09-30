package com.mahesh.threads;

public class ClassForNameExTest {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		try {
			Class<?> obj = Class.forName("com.mahesh.threads.Pulihora");
			ClassLoader cl = ClassForNameExTest.class.getClassLoader();
			Pulihora pulihora = (Pulihora) cl.loadClass("com.mahesh.threads.Pulihora").newInstance();
			pulihora.display();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
