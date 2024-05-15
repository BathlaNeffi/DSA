package timeComplexity;

import java.util.Scanner;
import java.util.Arrays;

public class PairSumInArray {
	public static int sumOfArray(int n){
		int sum=(int)((n*n -n)/2);
		return sum;
	}

//	public static void bubbleSort(int [] arr) {
//		int n=arr.length;
//		for(int j=n-1; j>0;j--) {
//			for(int i=0;i<j;i++) {
//				if(arr[i+1]<arr[i]) {
//					int temp=arr[i+1];
//					arr[i+1]=arr[i];
//					arr[i]=temp;
//				}
//			}
//		}
//	}

//	public static int duplicates(int arr[],int d) {
//		int k=0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==d) {k++;}
//		}
//		return k;
//	}

	public static int pairSum(int[] arr, int num) {
//		bubbleSort(arr);
		Arrays.sort(arr);
		int n=arr.length;
		int k=0;
		if(n==0) {return k;}
//		if(arr[0]==arr[n-1] && arr[0]+arr[n-1]==num) {k=sumOfArray(n-1); return k; }

		for(int i=0,j=n-1;i<j;) {

			if(num>arr[i]+arr[j]) {i++;}
			else if (num<arr[i]+arr[j]) {j--;}
			else{
				if(arr[i]==arr[j]) {int totalElementFromStartToEnd=(j-i)+1;k+=sumOfArray(totalElementFromStartToEnd);return k; }
				if((arr[i]==arr[i+1] || arr[j]==arr[j-1])) {
					int tempStart=i+1;
					int tempEnd=j-1;
					while(tempStart<=tempEnd && arr[tempStart]==arr[i]) {tempStart++;}
					while(tempStart<=tempEnd && arr[tempEnd]==arr[j]) {tempEnd--;}
					int left=(tempStart-i);
					int ryt=(j-tempEnd);
					
					
					
					k+=(ryt*left); i+=left;j-=ryt;
					}
				
				else {k++; i++;j--;}
			}

		}

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
		int num=s.nextInt();

		System.out.println(pairSum(arr1, num));

	}

}
