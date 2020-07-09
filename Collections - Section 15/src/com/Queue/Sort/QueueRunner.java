package com.Queue.Sort;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueRunner {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();
		queue.add("Zebra");
		queue.add("Cat");
		queue.add("Monkey");
		queue.add("Apple");
		
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}

}
