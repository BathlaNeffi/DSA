package DP;

public class SmallestSuperSequence {
	
	public static int smallestSuperSequenceI(String str1, String str2) {
		int n=str1.length();
		int m=str2.length();
		
		int dp[][]=new int [n+1][m+1];
		
		for(int i=0;i<=n;i++) {
			dp[i][0]=i;
		}
		for(int i=0;i<=m;i++) {
			dp[0][i]=i;
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(str1.charAt(i-1)==str2.charAt(j-1)) {
					dp[i][j]=1+dp[i-1][j-1];
				}
				else {
					int ans1=dp[i-1][j];
					int ans2=dp[i][j-1];
					
					int ans=Math.min(ans1, ans2)+1;
					dp[i][j]=ans;
				}
			}
		}
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
		
		return dp[n][m];
		
		
	}
	
	
	
	public static int smallestSuperSequencehelper(String str1, String str2,int i,int j) {
		int n=str1.length();
		int m=str2.length();
		if(i>=n&& j<m) {
			return m-j;
		}
		else if(j>=m && i<n) {
			return n-i;
			
		}
		else if(i==n&& j==m) {
			return 0;
		}
		
		int ans;
		
		if(str1.charAt(i)==str2.charAt(j)) {
			ans=smallestSuperSequencehelper(str1, str2, i+1, j+1) +1;
		}
		else {
			int ans2, ans3;
			
			ans2=  smallestSuperSequencehelper(str1, str2, i+1,j);
			ans3= smallestSuperSequencehelper(str1, str2, i, j+1);
			
			ans=1 + Math.min(ans2,ans3);
		}
		return ans;
	}

	public static int smallestSuperSequence(String str1, String str2) {
		return smallestSuperSequencehelper(str1, str2, 0, 0);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="abc";
		String str2="afc";
		System.out.println(smallestSuperSequenceI(str1, str2));
		

	}

}
