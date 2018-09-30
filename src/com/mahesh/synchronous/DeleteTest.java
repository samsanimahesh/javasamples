package com.mahesh.synchronous;

public class DeleteTest implements Runnable{
	Table table;
	DeleteTest(Table table){
		this.table = table;
	}
	@Override
	public void run() {
		table.deleteWheel();
	}

}
