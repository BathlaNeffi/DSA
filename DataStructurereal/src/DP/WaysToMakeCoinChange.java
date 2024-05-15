package DP;

public class WaysToMakeCoinChange {
	
	
	static long countWays(int coins[], int n, int sum)
    {
        // Time complexity of this function: O(n*sum)
        // Space Complexity of this function: O(sum)
 
        // table[i] will be storing the number of solutions
        // for value i. We need sum+1 rows as the table is
        // constructed in bottom up manner using the base
        // case (sum = 0)
        long[] table = new long[sum + 1];
 
        // Initialize all table values as 0
 
        // Base case (If given value is 0)
        table[0] = 1;
 
        // Pick all coins one by one and update the table[] values after the index greater than or equal to the value of the picked coin
        for (int i = 0; i < n; i++)
            for (int j = coins[i]; j <= sum; j++)
                table[j] += table[j - coins[i]];
        
        for(int i=0;i<table.length;i++) {
        	System.out.println(table[i]);
        }
 
        return table[sum];
        
        
    }
	
	
	public static int countWaysToMakeChangeI(int denominations[], int value){
		int n=denominations.length;
		int dp[][]=new int[n][value+1];
		for(int i=0;i<n;i++) {
			dp[i][0]=1;
		}
		for(int i=n-1;i>=0;i--) {
			for(int j=1;j<=value;j++) {
				int count1=0;
				if(i+1<=n-1) {
					count1=dp[i+1][j];
				}
				int count2=0;
				if(j-denominations[i]>=0) {
					count2=dp[i][j-denominations[i]];
				}
				dp[i][j]=count1+ count2;
				
			}
		}
		return dp[0][value];
       
	}
	
	public static int countWaysToMakeChangeDp(int denominations[], int value,int i,int [][]dp){
        // Write your code here
		
		if(i>=denominations.length|| value<0) {
			return 0;
		}
		if(value==0) {
			return 1;
		}
		
		
		
		

		
		int count;
		
		
			int ans1,ans2;
			
			if(dp[i][value-denominations[i]]==Integer.MIN_VALUE) {
				ans1=countWaysToMakeChange(denominations, value-denominations[i],i);
				dp[i][value]=ans1;
			}
			else {
				ans1=dp[i][value];
			}
			
			if(dp[i+1][value]==Integer.MIN_VALUE)
			{
			ans2=countWaysToMakeChange(denominations, value, i+1);
			dp[i+1][value]=ans2;
			}
			else {
				ans2=dp[i+1][value];
			}
			count=ans1+ans2;
			
		
		
		return count;
	}

	
	
	
	
	
	public static int countWaysToMakeChange(int denominations[], int value,int i){
        // Write your code here
		
		if(i>=denominations.length|| value<0) {
			return 0;
		}
		if(value==0) {
			return 1;
		}
		
		
		

		
		int count;
		
		
			int ans1=countWaysToMakeChange(denominations, value-denominations[i],i);
			int ans2= countWaysToMakeChange(denominations, value, i+1);
			count=ans1+ans2;
			
		
		
		return count;
	}
	
	
	
	static int count(int coins[], int n, int sum)
    {
 
        // If sum is 0 then there is 1 solution
        // (do not include any coin)
        if (sum == 0)
            return 1;
 
        // If sum is less than 0 then no
        // solution exists
        if (sum < 0)
            return 0;
 
        // If there are no coins and sum
        // is greater than 0, then no
        // solution exist
        if (n <= 0)
            return 0;
 
        // count is sum of solutions (i)
        // including coins[n-1] (ii) excluding coins[n-1]
        return count(coins, n - 1, sum)
            + count(coins, n, sum - coins[n - 1]);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr[]= {1,2,3,4,5,6};
//		
//		int value=300;
//		
//		int dp[][]=new int[arr.length+1][value+1];
//		
//		for(int i=0;i<dp.length;i++) {
//			for(int j=0;j<dp[0].length;j++) {
//				dp[i][j]=Integer.MIN_VALUE;
//			}
//		}
//		
//		System.out.println(countWaysToMakeChangeI(arr, value));
//		
//		
		
		
		 int coins[] = { 1, 2, 3 };
	        int n = coins.length;
	 
//	        System.out.println(count(coins, n, 4));
	        
	        countWays(coins, n, 10);
		
		
		

	}

}
