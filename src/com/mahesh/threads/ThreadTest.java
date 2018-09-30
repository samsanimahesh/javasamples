package com.mahesh.threads;

public class ThreadTest implements Runnable{
	public static void main(String[] args) {
		Thread t = new Thread(new ThreadTest());
		t.start();
	}

	@Override
	public void run() {
		System.out.println("test");
	}

}

