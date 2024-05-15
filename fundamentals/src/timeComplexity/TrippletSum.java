package timeComplexity;

import java.util.Scanner;
import java.util.Arrays;

public class TrippletSum {
	public static int sumOfArray(int n){
		int sum=(int)((n*n -n)/2);
		return sum;
	}


	public static int pairSum(int[] arr, int num) {

		Arrays.sort(arr);
		int n=arr.length;
		int k=0;
		if(n==0) {return k;}
		for(int z=0;z<n-2;z++) {

			for(int i=z+1,j=n-1;i<j;) {

				if(num>arr[i]+arr[j]+arr[z]) {i++;}
				else if (num<arr[i]+arr[j]+arr[z]) {j--;}
				else{

					if(arr[i]==arr[j]) {int totalElementFromStartToEnd=(j-i)+1;
					k+=sumOfArray(totalElementFromStartToEnd);break; 
					}
					else if((arr[i]==arr[i+1] || arr[j]==arr[j-1])) {
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
