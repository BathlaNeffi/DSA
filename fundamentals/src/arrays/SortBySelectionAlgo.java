package arrays;

import java.util.Scanner;

public class SortBySelectionAlgo {
	public static void printArray(int[] arry) {
		int n=arry.length;
		for(int i=0;i<n;i++) {
			System.out.print(arry[i]+" ");
			}
		System.out.println();
		
	}
	
	public static void sortBySelection(int [] arr) {
		int n=arr.length;
		for(int i=0; i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					
				}
			}
			
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
		sortBySelection(arr1);
		printArray(arr1);
		

	}

}
