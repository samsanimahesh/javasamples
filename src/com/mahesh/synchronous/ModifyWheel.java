package com.mahesh.synchronous;

public class ModifyWheel implements Runnable{
	
	Table table;
	ModifyWheel(Table table){
		this.table = table;
	}
	@Override
	public void run() {
		Table.modifyWheel();
	}

}
