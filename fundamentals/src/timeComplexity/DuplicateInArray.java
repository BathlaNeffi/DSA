package timeComplexity;

import java.util.Scanner;

public class DuplicateInArray {
	public static int sumOfArray(int n){
		int sum=(int)((n*n +n)/2);
		return sum;
	}
	
	public static int findDuplicate(int[] arr) {
		int n=arr.length;
		int SUM=sumOfArray(n-2);
		int arsum=0;
		for(int i=0;i<n;i++) {
			arsum+=arr[i];
			
		}
		int k=arsum-SUM;
		
		return k;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

		int [] arr1=new int [n];
		for(int i=0;i<n;i++){
			arr1[i]=s.nextInt();
		}
		System.out.println(findDuplicate(arr1));

	}

}
