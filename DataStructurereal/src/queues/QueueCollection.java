package queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> queue=new LinkedList<>();
		
		queue.add(10);
		queue.add(20);
		System.out.println(queue.size());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.size());
		
//		for(int i=1;i<5;i++) {
//			queue.add(10+i);
//		}
//		
//		System.out.println(queue.poll()+" "+queue.size());
//		

	}

}
