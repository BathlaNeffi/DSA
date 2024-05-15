package arrays;

import java.util.Scanner;

public class Sort012 {
	public static void printArray(int[] arry) {
		int n=arry.length;
		for(int i=0;i<n;i++) {
			System.out.print(arry[i]+" ");
		}
		System.out.println();
	}
	
	
	public static void swap(int arr[],int start, int end) {
		int temp=arr[start];
		arr [start]= arr[end];
		arr[end]=temp;
	}
	
	public static void sort(int arr[]) {
		int n=arr.length;
		int i=0,j=0,k=n-1;
		for(;i<n && k>i;) {
			if(arr[i]==0) {swap(arr, j, i);j++;i++;}
			else if(arr[i]==2) {swap(arr, k, i);k--;}
			else {i++;}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

		int [] arr1=new int [n];
		for(int i=0;i<n;i++){
			arr1[i]=s.nextInt();
		}
		sort(arr1);
		
		
		printArray(arr1);
		

	}

}
