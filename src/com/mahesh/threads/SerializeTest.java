package com.mahesh.threads;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeTest {
	
	public static void main(String[] args) {
		String file = "/Users/mahesh/Documents/workspace/javasamples/src/com/mahesh/threads/ser.txt";
		Apple apple = new Apple();
		apple.setCost("100$");
		apple.setModel("five");
		apple.setName("iphone");
		
		try{
			FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(apple);
            outputStream.flush();
            outputStream.close();
            System.out.println("Serialization completed");
            System.out.println(apple.toString());
            
		}catch(Exception e){
			System.out.println("Exception occured");
		}
	}

}
