package com.mahesh.vogella;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JaxbTest {
	
	public static void main(String[] args) throws JAXBException {
		JAXBContext contextObj = JAXBContext.newInstance(JaxbEmployees.class);  
		Unmarshaller jaxbUnmarshaller = contextObj.createUnmarshaller();    
        JaxbEmployees empList=(JaxbEmployees) jaxbUnmarshaller.unmarshal(new File("/Users/mahesh/Documents/workspace/javasamples/src/com/mahesh/vogella/jaxbemployee.xml"));  
        
        System.out.println(empList.getListOfEmployees().get(0).getName());
	}

}
