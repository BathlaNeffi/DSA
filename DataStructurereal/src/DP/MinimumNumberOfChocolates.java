package DP;

public class MinimumNumberOfChocolates {
	
	public static int getMin(int arr[], int N){
		int dp[]=new int[N];
		
		dp[0]=1;
		
		for(int i=1;i<N;i++) {
			if(arr[i]>arr[i-1]) {
				dp[i]=1+dp[i-1];
			}
			else
				dp[i]=1;
		}
		
		for(int i=N-2;i>=0;i--) {
			if(arr[i]>arr[i+1] && dp[i]<=dp[i+1]){
				dp[i]=dp[i+1]+1;
			}
		}
		
		int sum=0;
		for(int i=0;i<N;i++) {
			sum+=dp[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,8,1,5,4,6,7};
		
		int ans=getMin(arr, 8);
		System.out.println(ans);

	}

}
