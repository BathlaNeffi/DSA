package FullTest3;

import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {




	public static ArrayList<Integer> primeNumber(int n) {
		
		

		if(n==2) {
			ArrayList<Integer> test=new ArrayList<>();
			test.add(2);

			return test;
		}

		ArrayList<Integer> al;
		int i=2;
		for(;i<n;i++) {
			if(n%i==0) {
				break;
			}
		}

		al=new ArrayList<>();
		if(i==n) {
			al.add(n);
		}
		//			System.out.print(n+" ");


		ArrayList<Integer> smallArray=primeNumber(n-1);


		if(!smallArray.isEmpty()) {
			for(int j: smallArray) {
				al.add(j);
			}
		}


		return al;

	}






	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);

		int n=s.nextInt();
		
		if(n==1|| n==0) {
			return;
		}

		ArrayList<Integer> al=new ArrayList<>();

		al=primeNumber(n);
		int arr[]=new int [al.size()];

		if(!al.isEmpty()) {
			
		int k=arr.length-1;
			for(int i: al) {
				arr[k--]=i;
			}
		}
		
//		if(arr.length!=0) {
//			for( int i=0;i<arr.length;i++) {
//				System.out.print(arr[i]+" ");
//			}
//		}
//		System.out.println();
		
		for(int i:arr) {
			if( i-1<arr.length&& arr[i-1]<=n) {
				System.out.print(arr[i-1]+ " ");
			}
		}
		
		



	}

}
