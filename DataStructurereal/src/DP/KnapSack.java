package DP;

public class KnapSack {
	
	public static int knapsackI(int[] weights, int[] values, int W){
		
		int n=values.length;
		int dp[][]=new int[n+1][W+1];
		
		for(int i=n-1;i>=0;i--) {
			for(int w=0;w<=W;w++) {
				int ans;
				if(w>=weights[i]) {
					int ans1= values[i]+dp[i+1][w-weights[i]];
					int ans2=dp[i+1][w];
					ans=Math.max(ans1, ans2);
				}
				else {
					ans=dp[i+1][w];
				}
				dp[i][w]=ans;
			}
			
		}
		return dp[0][W];
		
	}
	
	
	
	public static int knapsackR(int[] weights, int[] values, int n, int maxWeight, int i) {
	
		if(i>=n) {
			return 0;
		}

		
		int ans;
		if(weights[i]<=maxWeight) {
			int ans1,ans2;
			ans1=values[i]+knapsackR(weights, values, n, maxWeight-weights[i], i+1);
			ans2=knapsackR(weights, values, n, maxWeight,i+1);
			
			ans=Math.max(ans1, ans2);
			
		}
		else {
			ans=knapsackR(weights, values, n, maxWeight, i+1);
		}
		return ans;
		
		
		
	}
	
	public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {
		//Your code goes here
		return knapsackR(weights, values, n, maxWeight,0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] weights= {1,2,4,5};
		int [] values= {5,4,8,6};
		int n=4;
		int maxWeight=5;
		int ans=knapsack(weights, values, n,maxWeight);
		System.out.println(ans);
		System.out.println(knapsackI(weights, values, maxWeight));
		

	}

}
