package com.mahesh.vogella;


import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="JaxbEmployees")
public class JaxbEmployees {
	
	private List<JaxbEmployee> listOfEmployees = null;

	@XmlElement(name="JaxbEmployee")
	public List<JaxbEmployee> getListOfEmployees() {
		return listOfEmployees;
	}

	public void setListOfEmployees(List<JaxbEmployee> listOfEmployees) {
		this.listOfEmployees = listOfEmployees;
	}

}
