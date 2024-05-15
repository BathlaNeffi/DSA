package DP;

import java.util.Scanner;

public class Fibonacci {
	
	
	public static int fibI(int n) {
//		if( n==1|| n==0) {
//			return n;
//		}
		
		int dp[]=new int [n+1];
		dp[0]=0;
		dp[1]=1;
		for( int i=2; i<=n;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		
		return dp[n];
	}
	
	
	
	public static int fib(int n, int arr[]) {
		if(n==0||n==1) {
			return n;
		}
		
		
		
		int ans1,ans2;
		
		if(arr[n-1]==-1) {
			ans1= fib(n-1,arr);
			arr[n-1]=ans1;
			}
		else {
			ans1=arr[n-1];
		
		}
		if(arr[n-2]==-1) {ans2= fib(n-2,arr);}
		else {
			ans2=arr[n-2];
			arr[n-2]=ans2;
		
		}
		
		int myans=ans1 + ans2;
		
		return myans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		
//		int arr[]=new int [n+1];
//		
//		for( int i=0;i<=n;i++) {
//			arr[i]=-1;
//		}
//		int ans=fib(n, arr);
		
//		System.out.println(ans);
		
		System.out.println(fibI(n));
		
		
		
		

	}

}
