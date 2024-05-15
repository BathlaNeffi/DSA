package DP;

public class LootHouses {
	public static int maxMoneyLooted(int[] houses) {
		int n=houses.length;
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return houses[1];
		}
		
		int maxMoneyCanBeLooted[]=new int[n];
		maxMoneyCanBeLooted[0]=houses[0];
		maxMoneyCanBeLooted[1]=Math.max(houses[0], houses[1]);
		for(int i=2;i<n;i++) {
			maxMoneyCanBeLooted[i]=Math.max(maxMoneyCanBeLooted[i-1], houses[i]+maxMoneyCanBeLooted[i-2]);
			
			System.out.println(maxMoneyCanBeLooted[i]);
		}
		
		
		return maxMoneyCanBeLooted[n-1];
		
		
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {5,7,6,11,2,1,15,5};
		
		int dp[]=new int[arr.length*2];
		for(int i=0;i<dp.length;i++) {
			dp[i]=-1;
		}
		System.out.println(maxMoneyLooted(arr));

	}

}
