package com.mahesh.linkedblockingdeque;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.BlockingDeque;

public class LinkedBlockingDequeProducer implements Runnable{
	protected BlockingDeque<String> blockingDeque;
    final Random random = new Random();
    public LinkedBlockingDequeProducer(BlockingDeque<String> queue) {
        this.blockingDeque = queue;
    }
	@Override
	public void run() {
		while (true) {
            try {
                String data = UUID.randomUUID().toString();
                System.out.println("Put: " + data);
                blockingDeque.addLast(data);
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
		
	}

}
