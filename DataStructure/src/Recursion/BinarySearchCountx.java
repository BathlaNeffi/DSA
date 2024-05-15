package Recursion;
import java.util.Scanner;

public class BinarySearchCountx {
	public static int searchx(int [] arr, int x) {
		
		int n=arr.length;
		
		int s=0;
		int e=n-1;
		int result=-1;
		
		while(s<=e) {
			int mid= s+(e-s)/2;
			if(arr[mid]==x) {result=mid; e=mid-1;}
			 else if(arr[mid]>x) {e=mid-1;}
			 else {s=mid+1;}
				
			}
		 s=0;
	e=n-1;
		int res2=0;

		while(s<=e) {
			int mid= s+(e-s)/2;
			if(arr[mid]==x) {res2=mid; s=mid+1;}
			 else if(arr[mid]>x) {e=mid-1;}
			 else {s=mid+1;}
				
			}
		result=res2-result+1;
		
		return result;
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		

		int [] arr1=new int [n];
		for(int i=0;i<n;i++){
			arr1[i]=s.nextInt();
		}
		int x=s.nextInt();
		System.out.println(searchx(arr1, x));
		

	}

}
