package com.mahesh.threads;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnMarshallingTest {
	public static void main(String[] args) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(NodeTypesMap.class);
	    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	    NodeTypesMap empMap = (NodeTypesMap) jaxbUnmarshaller.unmarshal(new File("/Users/mahesh/Documents/workspace/javasamples/src/com/mahesh/threads/NodeTypes.xml") );
	     NodeType nodeType = empMap.getEmployeeMap().get("Router6672");
	    System.out.println(nodeType.getConnectivityInfoId());
	}

}
