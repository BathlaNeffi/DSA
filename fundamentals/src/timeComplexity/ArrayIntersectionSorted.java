package timeComplexity;

import java.util.Scanner;

public class ArrayIntersectionSorted {
	
	public static void printArray(int[] arry) {
		int n=arry.length;
		for(int i=0;i<n;i++) {
			System.out.print(arry[i]+" ");
			}
		System.out.println();
		
	}
	
	
	public static void bubbleSort(int [] arr) {
		int n=arr.length;
		for(int j=n-1; j>0;j--) {
			for(int i=0;i<j;i++) {
				if(arr[i+1]<arr[i]) {
					int temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
				}
			}
		}
	}
	
	
	public static void findIntersection(int arr1[], int arr2[]) {
		int i=0,j=0;
		
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]==arr2[j]) { System.out.print(arr1[i] +" ");i++;j++;}
			else if  (arr1[i]>arr2[j]){j++;}
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

		int l=s.nextInt();

		int [] arr2=new int [l];
		for(int i=0;i<l;i++){
			arr2[i]=s.nextInt();
		}
	
//		printArray(arr1);
//		printArray(arr2);
		bubbleSort(arr2);
		bubbleSort(arr1);
		findIntersection(arr1, arr2);


	}

}
