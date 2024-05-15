package arrays;

import java.util.Scanner;

public class SecondLargestNumber {
	public static int largest(int arr[]) {
		int L=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=L) {L=arr[i];}
		}
		
		
		return L;
	}
	
	public static int secondLargest(int arr[]) {
		if(arr.length==0) {return Integer.MIN_VALUE;}
		int largest= arr[0],secondlargest=Integer.MIN_VALUE;
		for(int i=1;i<arr.length; i++) {
			if(arr[i]>largest) {secondlargest=largest;largest=arr[i];}
			else if(secondlargest<arr[i] && arr[i]!=largest) {secondlargest=arr[i];}
			
		}
		return secondlargest;
		
		
		
		
//			int L1=Integer.MIN_VALUE;
//			L1=largest(arr);
//			for(int i=0;i<arr.length;i++) {
//				if(arr[i]==L1) {arr[i]=Integer.MIN_VALUE;}
//			}
//			int L2=largest(arr);
//			return L2;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

		int [] arr1=new int [n];
		for(int i=0;i<n;i++){
			arr1[i]=s.nextInt();
		}
		int secLargest=secondLargest(arr1);
		System.out.println(secLargest);
		

	}

}
