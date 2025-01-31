package DP;



public class LCS {



	public static int lcsI(String s, String t) {

		int m=s.length();
		int n=t.length();

		int dp[][]=new int[m+1][n+1];

		for(int i=m-1;i>=0;i--) {
			for(int j=n-1;j>=0;j--) {
				if(s.charAt(i)==t.charAt(j)) {
					dp[i][j]=1+dp[i+1][j+1];
				}
				else {
					int ans1,ans2;

					ans1=dp[i+1][j];
					ans2=dp[i][j+1];
					dp[i][j]=Math.max(ans1, ans2);


				}
			}

		}
		return dp[0][0];



	}

	public static int lcsDp(String s, String t,int i, int j,int dp[][]) {
		int m=s.length();
		int n=t.length();
		if(i==m||n==j) {
			return 0;
		}
		int ans;

		if(s.charAt(i)==t.charAt(j)) {
			int smallAns;
			if(dp[i+1][j+1]==-1) {

				smallAns=lcsDp(s, t, i+1, j+1,dp);
				dp[i+1][j+1]=smallAns;
			}
			else {
				smallAns=dp[i+1][j+1];
			}
			ans=smallAns+1;
		}
		else {

			int  ans2,ans3;
			if(dp[i+1][j]==-1) {
				ans2=lcsDp(s, t, i+1, j,dp);
				dp[i+1][j]=ans2;
			}
			else {
				ans2=dp[i+1][j];
			}

			if(dp[i][j+1]==-1) {
				ans3=lcsDp(s, t, i, j+1,dp);
				dp[i][j+1]=ans3;
			}
			else {
				ans3=dp[i][j+1];
			}
			ans=Integer.max(ans2, ans3);
		}
		return ans;
	}


	public static int lcsHelper(String s, String t,int i, int j) {
		int m=s.length();
		int n=t.length();
		if(i==m||n==j) {
			return 0;
		}
		int ans=0;

		if(s.charAt(i)==t.charAt(j)) {
			ans=1+lcsHelper(s, t, i+1, j+1);
		}
		else {
			int ans2=lcsHelper(s, t, i+1, j);
			int ans3=lcsHelper(s, t, i, j+1);
			ans=Integer.max(ans2, ans3);
		}
		return ans;
	}

	public static int lcs(String s, String t) {
		//Your code goes here
		return lcsHelper(s,t,0,0);
	}

	public static void main(String[] args) {
		//longest common subsequence
		String s="adebc";
		String t="dcadb";

		int dp[][]=new int[s.length()+1][t.length()+1];

		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				dp[i][j]=-1;
			}
		}


		int ans=lcsDp(s, t, 0, 0, dp);
		System.out.println(ans);

		System.out.println(lcs(s, t));
		
		System.out.println(lcsI(s, t));

	}

}
