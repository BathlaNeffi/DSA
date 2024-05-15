package timeComplexity;

import java.util.Scanner;

public class ArrayEquilibriumIndex {
	public static int arrayEquilibriumIndex(int[] arr) {
		int leftSum=0;
		int rytSum=0;
		
		
		for(int i=0; i<arr.length;i++) {
			rytSum+=arr[i];			
		}
		for(int j=0;j<arr.length;j++) {
			rytSum-=arr[j];
			if(rytSum==leftSum) {return j;}
			leftSum+=arr[j];
			}
			
		
		
		
		
		return -1;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

		int [] arr1=new int [n];
		for(int i=0;i<n;i++){
			arr1[i]=s.nextInt();
		}
		System.out.println( arrayEquilibriumIndex(arr1));
		

	}

}
