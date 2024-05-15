package priorityQueue;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Collection;
import java.util.Collections;

public class KSmallestElements {
	
	
	
	
	public static ArrayList<Integer> kSmallestImproved(int input[], int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0; i<k;i++) {
			pq.add(input[i]);
		}
		for(int i=k;i<input.length;i++) {
			int minQueue=pq.peek();
			if(minQueue>input[i]) {
				pq.poll();
				pq.add(input[i]);
			}
			
			
		}
		
		ArrayList<Integer> sol=new ArrayList<>();
		while(!pq.isEmpty()) {
			sol.add(pq.poll());
		}
		return sol;
		
		
		
	}
	
	
	
	
	public static ArrayList<Integer> kSmallest(int[] input, int k) throws PriorityQueueException {
		Priority_Queue_max pq=new Priority_Queue_max();
		for(int i=0; i<k;i++) {
			pq.insert(input[i]);
		}
		for(int i=k;i<input.length;i++) {
			int maxQueue=pq.getMax();
			if(maxQueue>input[i]) {
				pq.removeMax();
				pq.insert(input[i]);
			}
			
			
		}
		
		ArrayList<Integer> sol=new ArrayList<>();
		while(!pq.isEmpty()) {
			sol.add(pq.removeMax());
		}
		return sol;
		
		
		
		
		// Write your code here

	}

	public static void main(String[] args) throws PriorityQueueException {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr2= new ArrayList<>();
		int arr[]= {6,2,1,4,19,20};
//		arr2=kSmallest(arr,3);
		arr2=kSmallestImproved(arr, 3);
		System.out.println(arr2);
		

	}

}
