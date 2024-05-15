package arrays;

import java.util.Scanner;

public class IntersectionOfTwoArraysII {
	public static void printArray(int[] arry) {
		int n=arry.length;
		for(int i=0;i<n;i++) {
			System.out.print(arry[i]+" ");
			}
		System.out.println();
		
	}
	public static void findIntersection(int arr1[], int arr2[]) {
		int i, j, c;
		for (i = 0; i < arr1.length; i++) {
			c = 0;
			for (j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {c++; 
				arr2[j]=Integer.MIN_VALUE; break;
				}
			}
			if(c>0){System.out.print(arr1[i] + " ");}
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

			int l=s.nextInt();

			int [] arr2=new int [l];
			for(int i=0;i<l;i++){
				arr2[i]=s.nextInt();
			}
		
//			printArray(arr1);
//			printArray(arr2);
			findIntersection(arr1, arr2);






		}

	}
