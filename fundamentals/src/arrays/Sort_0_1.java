package arrays;

import java.util.Scanner;

public class Sort_0_1 {
	public static void printArray(int[] arry) {
		int n=arry.length;
		for(int i=0;i<n;i++) {
			System.out.print(arry[i]+" ");
			}
		System.out.println();
		
	}
	public static void sort(int [] arr) {
		int n=arr.length;
		int i=0;
		int j=n-1;
		for(;i<=j;i++) {
			if(arr[i]==0)continue;
			else {int temp=arr[i];for(;j>i;j--) {
				if(arr[j]==1)continue;
				else { arr[i]=arr[j]; arr[j]=temp;break;}
			} }
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

		int [] arr1=new int [n];
		for(int i=0;i<n;i++){
			arr1[i]=s.nextInt();
		}
		sort(arr1);
		printArray(arr1);


	}

}
