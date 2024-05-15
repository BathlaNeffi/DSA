package DP;

public class SubsetSum {

	static boolean isSubsetPresentI(int[] arr, int n, int sum) {

		boolean[][] dp=new boolean[n+1][sum+1];
		for(int i=0;i<=n;i++)
		{
			dp[i][0]=true;
		}
		for(int i=1;i<=sum;i++)
		{
			dp[0][i]=false;
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sum;j++)
			{
				if(j<arr[i-1])
				{
					dp[i][j]=dp[i-1][j];
				}
				else
				{
					dp[i][j]=dp[i-1][j] || dp[i-1][j-arr[i-1]];
				}
			}
		}
		boolean result=dp[n][sum];
		return result;


	}

	static boolean isSubsetPresentR(int[] arr, int n, int sum,int i) {

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */

		if(sum==0) {
			return true;
		}
		else if(i>=n) {
			return false;
		}




		boolean ans1=isSubsetPresentR(arr, n, sum-arr[i], i+1);
		boolean ans2=isSubsetPresentR(arr, n, sum, i+1);

		return ans1||ans2;

	}




	static boolean isSubsetPresent(int[] arr, int n, int sum) {

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		return isSubsetPresentR(arr, n, sum, 0);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,2,5,6,7};
		System.out.println(isSubsetPresent(arr, 5, 14));

	}

}
