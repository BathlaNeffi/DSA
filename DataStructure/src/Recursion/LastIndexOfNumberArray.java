package Recursion;

import java.util.Scanner;



public class LastIndexOfNumberArray {
	
	
	
	public static int lastix(int arr[], int x ,int si) {
		if(arr.length==si) {return -1;}
			
		int sol=lastix(arr, x,  si+1);
		if( sol!=-1) { 
			return sol;}
			else {
				if(arr[si]==x) {return si;}
				else {return -1;}
			}
		}
	
	public static int LastIndex(int arr[],int x) {
		if(arr.length==0) {return -1;}
		
		int smallArray[] =new int [arr.length-1];
		for(int i=1; i<arr.length;i++) {
			smallArray[i-1]=arr[i];
			
		}
		
		int k=LastIndex(smallArray, x);
		if(k!=-1) {return k+1;}
		else {
			if(arr[0]==x) {return 0;}
			else return -1;
		}
		
		
		
		
		
		
	}
	
	
		
	
	
//	public static int lastindexofnumber() {
//		
//			return lastix(arr, x, 0);
//	}
		

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []arr1=new int [n];
		for(int i=0; i<arr1.length;i++) {
			arr1[i]=s.nextInt();
					
		}
		int x=s.nextInt();
		System.out.println(LastIndex(arr1, x));

	}

}
