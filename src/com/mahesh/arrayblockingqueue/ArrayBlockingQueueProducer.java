package com.mahesh.arrayblockingqueue;

import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueProducer implements Runnable{
	
	private BlockingQueue<String> blockingQueue;
	ArrayBlockingQueueProducer(BlockingQueue<String> blockingQueue){
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		try{
		blockingQueue.put("mahesh");
		Thread.sleep(5000);
		blockingQueue.put("babu");
		Thread.sleep(5000);
		blockingQueue.put("samsani");
		
//		System.out.println(blockingQueue.add("mahesh"));
//		System.out.println(blockingQueue.add("babu"));
//		System.out.println(blockingQueue.add("samsani"));
		}catch(Exception e){
			System.out.println("Producer exception occurred");
		}
		
	}

}
