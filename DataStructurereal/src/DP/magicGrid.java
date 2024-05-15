package DP;

public class magicGrid {
	
	public static int getMinimumStrengthI(int[][] grid) {
		int m=grid.length;
		int n=grid[0].length;
		int dp[][]=new int[m][n];
		dp[m-1][n-1]=1;
		dp[m-1][n-2]=1;
		dp[m-2][n-1]=1;
		
		for(int i=n-3;i>=0;i--) {
			dp[m-1][i]=dp[m-1][i+1]-grid[m-1][i+1];
			
		}
		
		for(int i=m-3;i>=0;i--) {
			dp[i][n-1]=dp[i+1][n-1]-grid[i+1][n-1];
		}
		
		for(int i=m-2;i>=0;i--) {
			for(int j=n-2;j>=0;j--) {
				int ans1=dp[i+1][j]-grid[i+1][j];
				int ans2=dp[i][j+1]-grid[i][j+1];
				int ans=Math.min(ans1, ans2);
				if(ans<1) {
					ans=1;
				}
				
				dp[i][j]=ans;
			}
		}
		return dp[0][0];
	}
	
	
	public static int getMinimumStrengthR(int[][] grid,int i,int j) {
		
		int m=grid.length;
		int n=grid[0].length;
		
		if((i==m-1 && j==n-2) ||(j==n-1&&i==m-2) ) {
			return 1;
		}
		 if(j==n-1 && i==m-1) {
			return 1;
		}
		
		int ans;
		
		
		int ans1;
		if(i+1>m-1) {
			ans1=Integer.MAX_VALUE;
		}
		else {
			ans1=getMinimumStrengthR(grid, i+1, j)-grid[i+1][j];
		}
		
		int ans2;
		if(j+1>n-1) {
			ans2=Integer.MAX_VALUE;
		}
		else {
		ans2=getMinimumStrengthR(grid, i, j+1)-grid[i][j+1];
		}
		ans=Integer.min(ans1, ans2);
		if(ans<1) {
			ans=1;
		}
		
		return ans;
		
	}
	

	public static int getMinimumStrength(int[][] grid) {

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		
		
		return getMinimumStrengthR(grid, 0, 0);
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][]= {{0,-2,-3,1},{-1,4,0,-2},{1,-2,-3,0}};
		
//		System.out.println(getMinimumStrength(arr));
		
		System.out.println(getMinimumStrengthI(arr));
	}

}
