package Recursion;

import java.util.Scanner;

public class FirstIndexNumberInAnArray {
	
	public static int checkindex(int arr[],int x, int sindex) {
		
		if(sindex==arr.length) {return -1;}
		if(arr[sindex]==x) {return sindex;}
		
		return checkindex(arr, x, sindex+1);
		
		
	}
	
	public static int findix(int arr[],int x) {
		
		return checkindex(arr, x, 0);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []arr1=new int [n];
		for(int i=0; i<arr1.length;i++) {
			arr1[i]=s.nextInt();
					
		}
		int x=s.nextInt();
		
		System.out.println(findix(arr1,x));
		

	}

}
