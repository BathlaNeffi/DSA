package DP;

import java.util.Scanner;

public class MinSquare {


	


	public static int minSquareDPI(int n) {

		int dp[]=new int[n+1];
		dp[0]=0;
		for( int i=1;i<=n;i++) {
			int MinAns=Integer.MAX_VALUE;
			for(int j=1;j*j<=i;j++) {
				int temp=dp[i-(j*j)];
				if(temp<MinAns) {
					MinAns=temp;
				}	
			}
			dp[i]=MinAns+1;	
		}

		return dp[n];
	}




	public static int minSquareDP(int num,int dp[]) {

		if(num==0) {
			return 0;
		}


		int MinAns=Integer.MAX_VALUE;

		for( int i=1;i*i<=num;i++) {
			int curr=i*i;
			int ans;
			if(dp[num-curr]==-1) {
				ans=minSquareDP(num-curr,dp);
				dp[num-curr]=ans;
			}
			else {
				ans=dp[num-curr];
			}


			if(MinAns>ans) {
				MinAns=ans;
			}

		}

		return MinAns+1;
	}



	public static int minSquare(int num) {

		if(num==0) {
			return 0;
		}


		int MinAns=Integer.MAX_VALUE;

		for( int i=1;i*i<=num;i++) {

			int ans=minSquare(num-(i*i));
			if(MinAns>ans) {
				MinAns=ans;
			}

		}	

		return MinAns+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


				Scanner s=new Scanner(System.in);
				int n=s.nextInt();
		//		int dp[]=new int[n+1];
		//		for(int i=0;i<=n;i++) {
		//			dp[i]=-1;
		//		}
		//		System.out.println(minSquareDP(n,dp));


		System.out.println(minSquareDPI(n));



	}

}
