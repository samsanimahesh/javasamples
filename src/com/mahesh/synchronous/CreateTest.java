package com.mahesh.synchronous;

public class CreateTest implements Runnable{
	
	Table table;
	CreateTest(Table table){
		this.table = table;
	}
	@Override
	public void run() {
		table.createWheel();
		
	}

}
