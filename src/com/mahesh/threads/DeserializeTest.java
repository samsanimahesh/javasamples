package com.mahesh.threads;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class DeserializeTest {
	public static void main(String[] args) {
		String file = "/Users/mahesh/Documents/workspace/javasamples/src/com/mahesh/threads/ser.txt";
		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream(file);
			ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
	        Apple geneated = (Apple) inputStream.readObject();
	        inputStream.close();
	        System.out.println(geneated.toString());
	        
	        System.out.println(geneated.getCost());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        
	}

}
