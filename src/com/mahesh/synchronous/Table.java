package com.mahesh.synchronous;

class Table {

	public void createWheel() {
		 synchronized(Table.class){
		System.out.println("Wheel created");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
	}

	public void deleteWheel() {
		synchronized (Table.class) {
			System.out.println("Wheel deleted");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static synchronized void modifyWheel() {
//		synchronized (this) {
			System.out.println("Wheel Modified");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		}
	}

}
