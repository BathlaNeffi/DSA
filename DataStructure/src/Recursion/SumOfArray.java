package Recursion;

import java.util.Scanner;

public class SumOfArray {
	public static int sumOfArray(int []arr) {
		if(arr.length==1) {return arr[0];}
		int [] small_arr=new int [arr.length -1];
		for(int i=1; i<arr.length; i++) {
			small_arr[i-1]=arr[i];
		}
		int small_sum=sumOfArray(small_arr);
		int sum=small_sum+arr[0];
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []arr1=new int [n];
		for(int i=0; i<arr1.length;i++) {
			arr1[i]=s.nextInt();
			
		}
		
		System.out.println(sumOfArray(arr1));
		

	}

}
