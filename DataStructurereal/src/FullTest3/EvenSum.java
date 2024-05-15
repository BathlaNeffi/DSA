package FullTest3;

import java.util.Scanner;

public class EvenSum {
	
	
	public static int count(int arr[],int n) {
		int odd_count=0,even_count=0;
		
		for(  int i=0;i<n;i++) {
			if(arr[i]%2==1) {
				odd_count++;
			}
			else {
				even_count++;
			}
			
		}
		
		if(odd_count%2==1) {
			return odd_count;
		}
		else {
			return even_count;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		int count=count(arr,n);
		System.out.println(count);

	}

}
