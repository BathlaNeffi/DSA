package priorityQueue;

import java.util.PriorityQueue;// this is alway min Priority Queue

public class InbuitPQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {56,34,21,67,91,98};
		
		PriorityQueue<Integer> PQ=new PriorityQueue<>();
		for(int i:arr) {
			PQ.add(i);
		}
		System.out.println(PQ.peek());
		while(!PQ.isEmpty()) {
			System.out.print(PQ.poll()+" ");
		}
		

	}

}
