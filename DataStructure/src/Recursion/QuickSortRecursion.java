package Recursion;

import java.util.Scanner;

public class QuickSortRecursion {
	public static void swap(int input[],int a, int b) {
		int temp=input[b];
		input[b]=input[a];
		input[a]=temp;
	}
	
	public static int partition(int arr[],int si,int ei) {
		int c=0;
		for(int i=si+1;i<=ei;i++) {
			if(arr[i]<=arr[si]) {c++;
			
			}
		}
		int pi=si+c;
		swap(arr, si, pi);
		
		int i=si,j=ei;
		
		while(i<pi && j>pi) {
			
			 if(arr[pi]>=arr[i]) {i++;}
			 else if(arr[pi]<arr[j]) {j--;}
			 else {
				swap(arr, i, j); 
				i++; j--;
			 }
		}
		
		return pi;
		
		
		
		
	}
	
	
	public static void quickSort(int arr[],int si, int ei) {
		if(si>=ei) {return;}
		int i=partition(arr,si,ei);
		quickSort(arr, si, i-1);
		quickSort(arr, i+1, ei);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

		int [] arr1=new int [n];
		for(int i=0;i<n;i++){
			arr1[i]=s.nextInt();
		}
		quickSort(arr1, 0, n-1);
		
		for(int j=0;j<arr1.length;j++) {
			System.out.print(arr1[j]+" ");
		}

	}

}
