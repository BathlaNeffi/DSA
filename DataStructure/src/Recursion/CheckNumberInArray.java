package Recursion;

import java.util.Scanner;

public class CheckNumberInArray {
	public static boolean checkNumber(int arr[], int x, int startindex) {
		if(startindex==arr.length) {return false;}
		if(arr[startindex]==x) {return true;}
		boolean isnumber=checkNumber(arr, x, startindex+1);
		return isnumber;
		
	}
	
	public static boolean isArray(int arr[],int x) {
		return checkNumber(arr, x, 0);
		
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
		System.out.println(isArray(arr1, x));

	}

}
