package DP;

public class MinCostPathProblem {
	
	
	// top Down approch
	public static int mincountITD(int [][]input,int x,int y) {
		int m=input.length;
		int n=input[0].length;
		
		
		int dp[][]=new int[m+1][n+1];
		
		for(int i=0; i<m+1;i++) {
			for(int j=0;j<n+1;j++) {
				dp[i][j]=Integer.MAX_VALUE;
			}
		}
		
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1&&j==1) {
					dp[i][j]=input[0][0];
					continue;
				}
				int ans1=dp[i-1][j];
				int ans2=dp[i][j-1];
				int ans3=dp[i-1][j-1];
				dp[i][j]= input[i-1][j-1]+Integer.min(ans1, Integer.min(ans2, ans3));
			}
		}
		return dp[m][n];
	}
	
	// buttom up approch
	public static int mincountI(int [][]input,int x,int y) {
		int m=input.length;
		int n=input[0].length;
		
		
		int dp[][]=new int[m+1][n+1];
		
		for(int i=0; i<m+1;i++) {
			for(int j=0;j<n+1;j++) {
				dp[i][j]=Integer.MAX_VALUE;
			}
		}
		
		for(int i=m-1;i>=0;i--) {
			for(int j=n-1;j>=0;j--) {
				if(i==m-1&&j==n-1) {
					dp[i][j]=input[m-1][n-1];
					continue;
				}
				int ans1=dp[i+1][j];
				int ans2=dp[i][j+1];
				int ans3=dp[i+1][j+1];
				dp[i][j]= input[i][j]+Integer.min(ans1, Integer.min(ans2, ans3));
			}
		}
		return dp[0][0];
	}
	
	
	
	public static int minCostPathR(int [][] input,int x,int y,int [][]dp) {
		if(x>input.length-1|| y>input[0].length-1) {
			return Integer.MAX_VALUE;
		}
		else if(x==input.length-1 &&y==input[0].length-1 ) {
			return input[input.length-1][input[0].length-1];
		}
		int ans1,ans2,ans3;
		if(dp[x+1][y]==Integer.MIN_VALUE) {
			ans1=minCostPathR(input, x+1, y, dp);
			dp[x+1][y]=ans1;
		}
		else {
			ans1=dp[x+1][y];
		}
		if(dp[x][y+1]==Integer.MIN_VALUE) {
			ans2=minCostPathR(input, x, y+1, dp);
			dp[x][y+1]=ans2;
			
		}
		else {
			ans2=dp[x][y+1];
		}
		
		if(dp[x+1][y+1]==Integer.MIN_VALUE) {
			ans3=minCostPathR(input,x+1,y+1,dp);
			dp[x+1][y+1]=ans3;
		}
		else {
			ans3=dp[x+1][y+1];
		}
		
	
		int minCost= input[x][y]+Integer.min(ans1, Integer.min(ans2, ans3));
		
		return minCost;
		
	
	}
	
	public static int helper(int [][] input,int x,int y) {
		if(x>input.length-1|| y>input[0].length-1) {
			return Integer.MAX_VALUE;
		}
		else if(x==input.length-1 &&y==input[0].length-1 ) {
			return input[input.length-1][input[0].length-1];
		}
		
		int minCost;
		minCost= Integer.min(helper(input, x+1, y), Integer.min(helper(input, x, y+1), helper(input, x+1, y+1)));
		
		return input[x][y]+minCost;
		
	}
	
	public static int minCostPath(int[][] input) {
		//Your code goes here
		return helper(input, 0, 0);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]= {{3,4,1,2},{2,1,8,9},{4,7,8,1}};
		
		int dp[][]=new int [arr.length+1][arr[0].length+1];
		for( int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				dp[i][j]=Integer.MIN_VALUE;
			}
		}
		System.out.println(mincountITD(arr, 0, 0));
		

	}

}
