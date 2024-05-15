package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class MinimumBracketReversal {
	
	
	public static int countBracketReversals(String input) {
		int k=-1;
		if(input.length()%2==1) {return k;}
		Stack<Character> stack =new Stack<>();
		//Your code goes here
		int count=0;
		for(int i=0; i<input.length();i++) {
			if(input.charAt(i)=='{') {stack.push(input.charAt(i));}
			else if(!stack.isEmpty() && stack.peek()=='{') {
				stack.pop();
			}
			else if(!stack.isEmpty() && stack.peek()=='}' ){stack.push(input.charAt(i));}
			else if(stack.isEmpty() && input.charAt(i)=='}' ) {stack.push(input.charAt(i));}
				
		}
		
		if(stack.isEmpty()) {return k;}
		
		while(!stack.isEmpty()) {
			char c1=stack.pop();
			char c2= stack.pop();
			if(c1==c2) {count++;}
			else {count+=2;}
		}
		return count;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println(countBracketReversals(str));
	}

}
