package arrays;

import java.util.Scanner;


public class RotateArray {
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
public static void reverseArray(int arr[],int start, int end) {
	
	while(start<end) {
		swap(arr, start, end);
		start++;
		end--;
	}
	
}
	
	
	
	public static void rotateArray(int [] arr,int d) {
		
		
		int n=arr.length;
		if(d>=n && n!=0) {
			d=d%n;}
			else if(n==0) {
				return;
				}
		
		reverseArray(arr, 0, n-1);
		reverseArray(arr, 0,n-d-1);
		reverseArray(arr, n-d, n-1);
//		int n=arr.length;
//		int temp=0;
//		for(int i=1;i<=d;i++) {
//			temp=arr[0];
//			for(int j=0;j<n-1;j++) {
//				arr[j]=arr[j+1];
//				
//			}
//			arr[n-1]=temp;
//		}
		
		
//		int n=arr.length;
//		int temp[]=new int[n];
//		int j=d;
//		int i=0;
//		for( ;j<n && i<n;j++,i++) {
//			temp[i]=arr[j];
//			
//		}
//		int m=0;
//		while(i<n) {
//			temp[i]=arr[m];
//			m++;
//			i++;
//		}
//		
//		for(int r=0; r<n;r++) {
//			arr[r]=temp[r];
//		}
		printArray(arr);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

		int [] arr1=new int [n];
		for(int i=0;i<n;i++){
			arr1[i]=s.nextInt();
		}
		int m=s.nextInt();
		rotateArray(arr1, m);
		
		
	}

}
