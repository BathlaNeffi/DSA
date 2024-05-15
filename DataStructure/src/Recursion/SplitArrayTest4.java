package Recursion;

import java.util.Scanner;

public class SplitArrayTest4 {
	static boolean aux(int arr[], int n,int start, int lsum, int rsum)
	{


		if (start == n)
			return lsum == rsum;


		if (arr[start] % 5 == 0)
			lsum += arr[start];


		else if (arr[start] % 3 == 0)
			rsum += arr[start];


		else


			return aux(arr, n, start + 1, lsum + arr[start], rsum)|| aux(arr, n, start + 1, lsum, rsum + arr[start]);

		return aux(arr, n, start + 1, lsum, rsum);
	}



	static boolean splitArray(int arr[], int n)
	{

		return aux(arr, n, 0, 0, 0);
	}





	public static boolean splitArray(int [] arr) {

		return splitArray(arr, arr.length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []arr1=new int [n];
		for(int i=0; i<arr1.length;i++) {
			arr1[i]=s.nextInt();


		}
		System.out.println(splitArray(arr1));


	}

}
