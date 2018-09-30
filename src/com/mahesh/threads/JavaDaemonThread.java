package com.mahesh.threads;

import java.util.Date;

public class JavaDaemonThread {
	 
    public static void main(String[] args) throws InterruptedException {
        Thread dt = new Thread(new DaemonThread(), "dt");
        m1();
        dt.setDaemon(true);
        dt.start();
        //continue program
        Thread.sleep(30000);
        System.out.println("Finishing program");
    }

	private static void m1() {
		System.out.println("Mymehtod1");
		
	}
 
}
 
class DaemonThread implements Runnable{
 
    @Override
    public void run() {
        while(true){
            processSomething();
        }
    }
 
    private void processSomething() {
        try {
            System.out.println("Processing daemon thread "+new Date());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
     
}

