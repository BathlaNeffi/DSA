package queues;

import java.util.Queue;
import java.util.LinkedList;

public class ReverseQueue {
	
	
	
	public static void reverseQueue(Queue<Integer> input) {
		//Your code goes here
		
		if(input.size()<=1) {
			return;
		}
		
		int temp=input.poll();
		reverseQueue(input);
		input.add(temp);
		
		
		
		
		
		
//		Queue<Integer> ans=new LinkedList<>();
		
//		int size=input.size();
//		
//		for(int i=0; i<size;i++) {
//			
//			for(int j=0;j<input.size()-1;j++) {
//				int temp=input.peek();
//				input.remove();
//				input.add(temp);
//			}
//			ans.add(input.peek());
//			input.poll();
//		}
//		while(!ans.isEmpty()) {
//			input.add(ans.poll());
//		}
	}
	
	
	
	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
		//Your code goes here
		
		
		Queue<Integer> ans=new LinkedList<>();
		
		for(int i=0; i<k;i++) {
			ans.add(input.poll());
		}
		
		reverseQueue(ans);
		
		while(!ans.isEmpty()) {
			input.add(ans.poll());
		}
		
		for(int i=0;i<input.size()-k;i++) {
			int temp=input.peek();
			input.remove();
			input.add(temp);
			}
		
		return input;
		
		
		
		
	
		
		
		
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,20,30,40,50,60,70,80,90};
		
		
		Queue<Integer> input =new LinkedList<> () ;
		
		for(int elem :arr) {
			input.add(elem);
		}
		
		
		input=reverseKElements(input, 4);
//		reverseQueue(input);
		
		while(!input.isEmpty()) {
			System.out.println(input.remove());
		}
		
		
		
		
		

	}

}
