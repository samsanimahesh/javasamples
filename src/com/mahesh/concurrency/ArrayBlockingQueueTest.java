package com.mahesh.concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue(10);
		Producer producer = new Producer(blockingQueue);
		
		Consumer consumer = new Consumer(blockingQueue);
		new Thread(producer).start();
		new Thread(consumer).start();
		Thread.sleep(4000);
	}

}

 class Producer implements Runnable{

    protected BlockingQueue<Integer> queue = null;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            queue.put(1);
            Thread.sleep(1000);
            queue.put(2);
            Thread.sleep(1000);
            queue.put(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
 
 class Consumer implements Runnable{

	    protected BlockingQueue<Integer> queue = null;

	    public Consumer(BlockingQueue<Integer> queue) {
	        this.queue = queue;
	    }

	    public void run() {
	        try {
	            System.out.println(queue.take());
	            System.out.println(queue.take());
	            System.out.println(queue.take());
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}
