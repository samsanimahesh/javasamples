package com.mahesh.linkedblockingdeque;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDequeTest {
	public static void main(String[] args) {
		final BlockingDeque<String> priorityBlockingQueue = new LinkedBlockingDeque<String>();

        LinkedBlockingDequeProducer queueProducer = new LinkedBlockingDequeProducer(
                priorityBlockingQueue);
        new Thread(queueProducer).start();

        LinkedBlockingDequeueConsumer queueConsumer1 = new LinkedBlockingDequeueConsumer(
                priorityBlockingQueue);
        new Thread(queueConsumer1).start();

        LinkedBlockingDequeueConsumer queueConsumer2 = new LinkedBlockingDequeueConsumer(
                priorityBlockingQueue);
        new Thread(queueConsumer2).start();
	}

}
