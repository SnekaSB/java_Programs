package collectiondemo;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
 
	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue();
		q.add(1);
		q.add(5);
		q.add(3);
		q.offer(5);
		System.out.println(q);//insertion order and duplicate value allowed
		
		//System.out.println(q.element());
		//System.out.println(q.peek());
		
		System.out.println(q.remove());
		System.out.println(q);
		System.out.println(q.poll());
	}
}
