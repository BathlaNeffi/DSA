package timeComplexity;

import java.util.Scanner;



public class FindLeadersInArray {
	public static void printArray(int[] arry,int start) {
		int n=arry.length;
		for(int i=start;i<n;i++) {
			
			System.out.print(arry[i]+" ");
		}
		System.out.println();
	}
	
	
	public static void leaders(int[] arr) {
		int n=arr.length;
		int [] sol= new int [n];
		int i=0;
		int solindex=n-1;
		for( ;i<n;i++) {
			
			
			int j=i+1;
			for(; j<n;j++) {
				if(arr[i]<arr[j]) {
					break;}
				
				
			}
			if(j==n){sol[solindex]=arr[i];solindex--;}
			
			
		}
		
		printArray(sol,solindex+1);

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

		int [] arr1=new int [n];
		for(int i=0;i<n;i++){
			arr1[i]=s.nextInt();
		}
		leaders(arr1);
		

	}

}
