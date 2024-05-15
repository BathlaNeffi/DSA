package arrays;

import java.util.Scanner;

public class InsertionSortAlgo {
	public static void printArray(int[] arry) {
		int n=arry.length;
		for(int i=0;i<n;i++) {
			System.out.print(arry[i]+" ");
		}
		System.out.println();
	}

	public static void insertionSort(int [] arr) {
		int n=arr.length;
		for(int i=0;i<=n-1;i++) {
			int k=i;
			for(int j=i-1;j>=0;j--) {
				if(arr[k]<arr[j]) {
					int temp=arr[j];
					arr[j]=arr[k];
					arr[k]=temp;
					k--;
				}
				else {break;}
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
		insertionSort(arr1);
		printArray(arr1);

	}

}
