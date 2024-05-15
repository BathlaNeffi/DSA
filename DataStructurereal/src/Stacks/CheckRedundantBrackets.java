package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class CheckRedundantBrackets {
	public static boolean checkRedundantBrackets(String str) {
		//Your code goes here
		boolean isredundant=false;
		Stack <Character> stack =new Stack<>();
		int j=str.length();
		
		for(int i=0;i<j;i++) {
			if(str.charAt(i)==')') {
				int count=0;
				while(stack.peek()!='(') {
					stack.pop();
					count++;
				}
				if(count<3) {return true;}
				stack.pop();
				
			}
			else {
				stack.push(str.charAt(i));
			}
		}
		
		return isredundant;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println(checkRedundantBrackets(str));
		

	}

}
