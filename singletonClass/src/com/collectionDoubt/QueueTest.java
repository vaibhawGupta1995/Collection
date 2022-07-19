package com.collectionDoubt;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		
		Queue<Integer> q=new PriorityQueue<Integer>();
		q.offer(4);
		q.offer(41);
		q.offer(14);
		q.offer(44);
		q.offer(44);
		q.offer(79);
		//q.offer(null);  gives Exception
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());

	}

}
