package Stacks;

import java.util.Stack;

public class StackCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack <Integer> stack =new Stack<>();
		int arr[]= {2,4,6,4,8};

		for(int i:arr) {
			stack.push(i);
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}






		//		stack.push(10);
		//		stack.push(20);
		//		System.out.println(stack.peek());
		//		System.out.println(stack.pop());
		//		System.out.println(stack.size());
		//		System.out.println(stack.isEmpty());



	}

}
