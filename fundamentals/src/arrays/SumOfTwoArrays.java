package arrays;

import java.util.Scanner;

public class SumOfTwoArrays {
	public static void printArray(int[] arry) {
		int n=arry.length;
		for(int i=0;i<n;i++) {
			System.out.print(arry[i]+" ");
		}
		System.out.println();
	}

	public static void sumOfArray(int arr1[],int arr2[], int output[]) {
		int i=arr1.length-1;
		int j=arr2.length-1;
		int k=Math.max(arr1.length,arr2.length);
		int carry=0;

		while(j>=0 && i>=0) {
			int temp=arr1[i]+arr2[j]+carry;
			carry=temp/10;
			output[k]=temp%10;
			//			System.out.println(output[k]+" K "+k);
			i--;
			j--;
			k--;

		}
		while(i>=0) {
			int temp=arr1[i]+carry;
			carry=temp/10;
			output[k]=temp%10;
			//			System.out.println(output[k]+" K "+k);
			i--;
			k--;}
		while(j>=0) {
			int temp=arr1[j]+carry;
			carry=temp/10;
			output[k]=temp%10;
			//				System.out.println(output[k]+" K "+k);
			j--;
			k--;}

	
	output[0]=carry;



	printArray(output);
}



public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();

	int [] arr1=new int [n];
	for(int i=0;i<n;i++){
		arr1[i]=s.nextInt();
	}


	int m=s.nextInt();

	int [] arr2=new int [m];
	for(int i=0;i<m;i++){
		arr2[i]=s.nextInt();
	}
	int [] output =new int [1+ Math.max(arr1.length,arr2.length)];

	//		if(m>n) {int [] output=new int [m];}
	//		else {int [] output=new int [n];}
	//		

	//		printArray(arr1);
	//		printArray(arr2);
	sumOfArray(arr1, arr2, output);

}



}
