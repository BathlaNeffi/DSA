package arrays;

import java.util.Scanner;

public class PairSum {

	public static int sumPair(int [] arr, int x) {
		int n=arr.length;

		int c=0;

		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) { for(int k=j+1;k<n;k++) {

				if((arr[j]+arr[i]+arr[k])==x ) {

					System.out.println(arr[i]+" "+arr[j] + " "+ arr[k]);

					c++;
					}
			}
			}
		}

		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

		int [] arr1=new int [n];
		for(int i=0;i<n;i++){
			arr1[i]=s.nextInt();
		}
		int x=s.nextInt();
		int result=sumPair(arr1, x);
		System.out.println(result);



	}

}
