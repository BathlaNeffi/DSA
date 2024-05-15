package DP;

public class MaximumSquareMatrixWithAllZeros {
	
	

	public static int findMaxSquareWithAllZeros(int[][] input){
        
	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
	 * Taking input and printing output is handled automatically.
	 */
		
		
		int n=input.length;
		if(n==0){
			return 0;
		}
		int m=input[0].length;
		
		int dp[][]=new int [n][m];
		
		//base case
		for(int i=0;i<n;i++) {
			if(input[i][0]==0) {
				dp[i][0]=1;
			}
		}
		for(int i=0;i<m;i++) {
			if(input[0][i]==0) {
				dp[0][i]=1;
			}
		}
		int max=0;
		
		
		for(int i=1;i<n;i++) {
			for(int j=1;j<m;j++) {
				if(input[i][j]==0) {
				int ans1=dp[i-1][j-1];
				int ans2=dp[i-1][j];
				int ans3=dp[i][j-1];
				
				int ans=1+Math.min(ans2, Math.min(ans1, ans3));
				dp[i][j]=ans;
				if(ans>max) {
					max=ans;
				}
				}
			}
		}
		return max;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]=new int [4][4];
		System.out.println(findMaxSquareWithAllZeros(arr));
		

	}

}
