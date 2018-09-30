package com.mahesh.arrayblockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueTest {
	public static void main(String[] args) {
		BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<String>(2);
		ArrayBlockingQueueProducer producer = new ArrayBlockingQueueProducer(blockingQueue);
		ArrayBlockingQueueConsumer consumer = new ArrayBlockingQueueConsumer(blockingQueue);
		new Thread(producer).start();
		new Thread(consumer).start();
	}

}
