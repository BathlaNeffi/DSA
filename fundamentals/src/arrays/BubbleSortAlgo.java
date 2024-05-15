package arrays;

import java.util.Scanner;

public class BubbleSortAlgo {
	public class SortBySelectionAlgo {
		
	
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

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();

			int [] arr1=new int [n];
			for(int i=0;i<n;i++){
				arr1[i]=s.nextInt();
			}
			bubbleSort(arr1);
			printArray(arr1);

		}
	}
}



