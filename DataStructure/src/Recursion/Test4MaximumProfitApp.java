package Recursion;

import java.util.Scanner;
import java.util.Arrays;

public class Test4MaximumProfitApp {
	
	
	public static int max(int arr[]) {
		Arrays.sort(arr);
		
		int max=Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length;i++) {
			
			
			if((arr.length-i)*arr[i]>=max) {max=(arr.length-i)*arr[i];}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []arr1=new int [n];
		for(int i=0; i<arr1.length;i++) {
			arr1[i]=s.nextInt();
					
		}
		System.out.println(max(arr1));
		
		

	}

}
