package DP;

import java.util.Scanner;

public class StareCaseUsingDP {
	
	
	
	
	public static long stareCaseI(int n) {
		
		if(n<0) {
			return 0;
		}
		if( n==0) {
			return 1;
		}
		if(n==3) {
			long ans=4;
			return ans;
		}
		if( n==2) {
			long ans=2;
			return ans;
		}
		if( n==1) {
			long ans=1;
			return ans;
		}
		
		long dp[]=new long[n+1];
		dp[0]=1;
		dp[1]=1;
		dp[2]=2;
		dp[3]=4;
		
		for( int i=4;i<=n;i++) {
			dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
			
		}
		
		long ans=dp[n];
		return ans;
		
		
	}
	
	
	
	
	
	
	
	public static long staircaseDP(int n, long dp[]) {
		
		if(n<0) {
			return 0;
		}
		if( n==0) {
			return 1;
		}
		if(n==3) {
			long ans=4;
			return ans;
		}
		if( n==2) {
			long ans=2;
			return ans;
		}
		if( n==1) {
			long ans=1;
			return ans;
		}
		long x,y,z;
		if(dp[n-1]==-1) {
			x=staircase(n-1);
			dp[n-1]=x;
			
		}
		else {
			x=dp[n-1];
		}
		if(dp[n-2]==-1) {
			y=staircase(n-2);
			dp[n-2]=y;
			
		}
		else {
			y=dp[n-2];
		}
		
		if(dp[n-3]==-1) {
			z=staircase(n-3);
			dp[n-3]=z;
			
		}
		else {
			z=dp[n-3];
		}
		
		long ans=x+y+z;
		return ans;
		
		
		
	}
	
	
	public static long staircase(int n) {
		//Your code goes here
		if( n==0) {
			return 1;
		}
		if(n==3) {
			long ans=4;
			return ans;
		}
		if( n==2) {
			long ans=2;
			return ans;
		}
		if( n==1) {
			long ans=1;
			return ans;
		}
		
		long finaAns=staircase(n-3)+staircase(n-2)+staircase(n-1);
		return finaAns;
	}

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		
		long arr[]=new long [n+1];
		
		for( int i=0;i<=n;i++) {
			arr[i]=-1;
		}
		long ans=staircaseDP(n, arr);
		
		System.out.println(ans);
		
		
//		System.out.println(staircase(0));
		
		
//		System.out.println(stareCaseI(n));

	}

}
