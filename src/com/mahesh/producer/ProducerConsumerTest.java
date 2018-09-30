package com.mahesh.producer;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerTest {
	public static void main(String args[]) {

        final Queue sharedQ = new LinkedList();

        Thread producer = new Producer(sharedQ);
        Thread consumer = new Consumer(sharedQ);

        producer.start();
        consumer.start();

    }

}
