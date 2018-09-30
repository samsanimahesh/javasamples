package com.mahesh.arrayblockingqueue;

import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueConsumer implements Runnable{
	private BlockingQueue<String> blockingQueue;
	
	ArrayBlockingQueueConsumer(BlockingQueue<String> blockingQueue){
		this.blockingQueue = blockingQueue;
	}
	@Override
	public void run() {
		try{
			System.out.println("Consumed : "+blockingQueue.take());
			System.out.println("Consumed : "+blockingQueue.take());
			System.out.println("Consumed : "+blockingQueue.take());
		}catch(Exception e){
			System.out.println("Consumer exception occurred");
		}
		
	}

}
