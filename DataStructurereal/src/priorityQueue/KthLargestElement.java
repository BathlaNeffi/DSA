package priorityQueue;


import java.util.ArrayList;
import java.util.PriorityQueue;

public class KthLargestElement {
	
	public static int kthLargest(int n, int[] input, int k) {
		
		// Write your code here
		
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0; i<k;i++) {
			pq.add(input[i]);
		}
		
		for(int i=k;i<input.length;i++) {
			if(input[i]>pq.peek()) {
				pq.poll();
				pq.add(input[i]);
			}
		}
		
		return pq.peek();
	

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {9,4,8,7,11,3};
		System.out.println(kthLargest(arr.length, arr, 2));

	}

}
