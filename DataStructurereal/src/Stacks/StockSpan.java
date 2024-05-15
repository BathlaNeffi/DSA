package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {


	public static int[] stockSpan(int[] price) {
		//Your code goes here
		Stack<Integer> stack=new Stack<>();

		int sol[]= new int[price.length];
		for(int i=0;i<price.length;i++) {
			
			while(!stack.isEmpty() && price[stack.peek()]<price[i]) {
				stack.pop();
			}
			
			if(stack.isEmpty()) {
				sol[i]=i+1;
			}
			else {
				sol[i]=i-stack.peek();
			}
			stack.push(i);
			
			
			
			
		}
		return sol;
		
		
//		for(int i=0;i<price.length;i++) {
//			for(int j=0;j<price.length-i;j++) {
//				stack.push(price[j]);
//
//			}
//			int count=1;
//			int value=stack.peek();
//			stack.pop();
//			while(!stack.isEmpty()) {
//
//
//				if(stack.peek()<value) {
//					count++;
//					stack.pop();
//				}
//				else if(stack.peek()>=value) {break;}
//				
//			}
//			sol[price.length-1-i] = count;
//		}
//		int reverse[]=new int[sol.length];
//		for(int i=sol.length-1,j=0;i>=0;i--,j++) {
//			reverse[j]=sol[i];
			
			
//		}
//		return sol;
//		
	}
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int arr[]= new int[s.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		arr=stockSpan(arr);

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}


	}

}
