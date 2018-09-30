package com.mahesh.threads;

import java.io.Serializable;

public class Apple implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private String name;
	private String model;
	private String cost;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}

}
