package Recursion;
import java.util.Scanner;
public class MergeSortRecursion {
	public static void mergered(int []arry,int []b, int []c) {
		
		int i=0,j=0,k=0;
		while(i<b.length && j<c.length) {
			if(b[i]<=c[j]) {arry[k]=b[i];i++;k++;}
			else {arry[k]=c[j];j++;k++;}
			
		}
		while(j<c.length) {
			arry[k]=c[j];j++;k++;
			
		}
		while(i<b.length) {
			arry[k]=b[i];i++;k++;
			
		}
		
		
	}
	
	public static void mergeSort(int [] arr) {
		if(arr.length<=1) {return;}
		
		int []b=new int[arr.length/2];
		int []c=new int[arr.length-b.length];
		
		for(int i=0; i<arr.length/2;i++) {
			b[i]=arr[i];
			
		}
		for(int i=arr.length/2; i<arr.length;i++) {
			c[i-arr.length/2]=arr[i];
			
		}
		
		mergeSort(b);
		mergeSort(c);
		mergered(arr, b, c);
		
		
	}
	
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []arr1=new int [n];
		for(int i=0; i<arr1.length;i++) {
			arr1[i]=s.nextInt();
					
		}
		mergeSort(arr1);
		for(int i=0; i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}

	}

}
