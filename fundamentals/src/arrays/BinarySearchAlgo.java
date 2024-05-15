package arrays;

import java.util.Scanner;

public class BinarySearchAlgo {
	
	public static int binnarySearch(int [] arr,int x) {
		int n=arr.length;
		int s=0;
		int e=n-1;
		while(s<=e) {
			int m=(s+e)/2;
			if(arr[m]<x) {s=m+1;}
			else if(arr[m]>x) {e=m-1;}
			else {return m;}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

		int [] arr1=new int [n];
		for(int i=0;i<n;i++){
			arr1[i]=s.nextInt();
		}
		int x=s.nextInt();
		int k=binnarySearch(arr1, x);
		System.out.println(k);
		
		

	}

}
