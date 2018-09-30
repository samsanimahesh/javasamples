package com.mahesh.synchronous;

public class SynchronousTest {
	public static void main(String[] args) {
		Table table = new Table();
		CreateTest createTest = new CreateTest(table);
		DeleteTest deleteTest = new DeleteTest(table);
		ModifyWheel modifyTable = new ModifyWheel(table);
		
		new Thread(createTest).start();
		new Thread(createTest).start();
		new Thread(createTest).start();
		new Thread(deleteTest).start();
		new Thread(deleteTest).start();
		new Thread(deleteTest).start();
		new Thread(deleteTest).start();
		new Thread(modifyTable).start();
		new Thread(modifyTable).start();
		new Thread(modifyTable).start();
	}

}
