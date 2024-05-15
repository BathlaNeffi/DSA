package Stacks;
import java.util.Scanner;
import java.util.Stack;
public class ReverseStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,6,7,1,9};
		Stack<Integer> stack=new Stack<>();
		Stack<Integer> helper=new Stack<>();
		for(int elem:arr) {
			stack.push(elem);
		}
		
		reverseStack(stack,helper);
		
		while(!stack.isEmpty()) {
			 System.out.println(stack.pop());  
		}
		
		

	}

	public static void reverseStack(Stack<Integer> stack, Stack<Integer> helper) {
		// TODO Auto-generated method stub
		if(stack.isEmpty()) {return;}
		int temp=stack.pop();
		
//		if(stack.isEmpty()) {return;}
		
		reverseStack(stack, helper);
		while(!stack.isEmpty()) {
			helper.push(stack.pop());
		}
		stack.push(temp);
		
		while(!helper.isEmpty()) {
			stack.push(helper.pop());
			
		}
		
	
	}

}
