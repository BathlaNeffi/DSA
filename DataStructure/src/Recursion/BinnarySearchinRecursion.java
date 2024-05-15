package Recursion;

import java.util.Scanner;

public class BinnarySearchinRecursion {
	
	
	public static int binarySearch(int arr[], int x, int si , int ei) {
		if(si>ei) {return -1;}

		int mid=si+(ei-si)/2;
		if(arr[mid]==x) {return mid;}
		else if(arr[mid]>x) { return binarySearch(arr, x, si, mid-1);}
		else  return binarySearch(arr, x, mid+1, ei);
		
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
		
		System.out.println(binarySearch(arr1, x, 0, arr1.length-1));

	}

}
