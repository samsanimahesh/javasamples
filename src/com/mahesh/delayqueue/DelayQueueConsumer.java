package com.mahesh.delayqueue;

import java.util.concurrent.BlockingQueue;

public class DelayQueueConsumer implements Runnable{
	protected BlockingQueue<DelayElement> blockingQueue;

	public DelayQueueConsumer(BlockingQueue<DelayElement> queue) {
		this.blockingQueue = queue;
	}
	

	@Override
	public void run() {
		while (true) {
			try {
				DelayElement delayElement = blockingQueue.take();
				System.out.println(Thread.currentThread().getName()
						+ " take(): " + delayElement);
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
