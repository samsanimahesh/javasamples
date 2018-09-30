package com.mahesh.synchronousqueue;

import java.util.UUID;
import java.util.concurrent.BlockingQueue;

public class SynchronousQueueProducer implements Runnable{
	BlockingQueue<String> synchronousQueue;
	public SynchronousQueueProducer(BlockingQueue<String> synchronousQueue){
		this.synchronousQueue = synchronousQueue;
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				String data = UUID.randomUUID().toString();
				System.out.println("Put: " + data);
				synchronousQueue.put(data);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
