package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class BalanceBracket {
	
	 public static boolean isBalanced(String str) {
	        //Your code goes here
		 Stack <Character> stack =new Stack<>();
		 int j=str.length();
		  for (int i=0; i<j;i++) {
			 
			  
		   if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[' ) {stack.add(str.charAt(i));}
		  else if (stack.isEmpty()){
				return false;
			}
			  else if(str.charAt(i)==')' && stack.peek()=='(') {stack.pop();}
			  else if (str.charAt(i)=='}' && stack.peek()=='{') {stack.pop();}
			  else if (str.charAt(i)==']' && stack.peek()=='[') {stack.pop();}
			   
				
			} 
		  
		  return stack.isEmpty();
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s=new Scanner(System.in);
		String str=s.next();
		
		System.out.println(isBalanced(str));
		
		
		
		
		
	

	}

}
