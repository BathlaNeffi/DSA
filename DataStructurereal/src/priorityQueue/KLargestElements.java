package priorityQueue;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KLargestElements {
	
	public static ArrayList<Integer> kLargest(int input[], int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0; i<k;i++) {
			pq.add(input[i]);
		}
		for(int i=k;i<input.length;i++) {
			int minQueue=pq.peek();
			if(minQueue<input[i]) {
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

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr2= new ArrayList<>();
		int arr[]= {9,5,7,8,4,1,6,3,2};
		
//		arr.add(12);
//		arr.add(18);
//		arr.add(2);
//		arr.add(45);
//		arr.add(53);
		arr2=kLargest(arr, 3);
		System.out.println(arr2);

	}

}
