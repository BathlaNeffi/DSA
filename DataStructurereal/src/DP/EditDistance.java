package DP;

public class EditDistance {
	
	
	public static int editDistanceI(String str1, String str2) {
		
		int m=str1.length();
		int n=str2.length();
		int dp[][]=new int [m+1][n+1];
		for(int j=0;j<=n;j++) {
			dp[0][j]=j;
		}
		for(int j=0;j<=m;j++) {
			dp[j][0]=j;
		}
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
		
				if(str1.charAt(i-1)==str2.charAt(j-1)) {
					dp[i][j]=dp[i-1][j-1];
				}
				else {
					int ans1,ans2, ans3;
					
					ans1=dp[i-1][j-1];
					ans2=dp[i][j-1];
					ans3=dp[i-1][j];
					dp[i][j]=Math.min(ans2, Math.min(ans1, ans3))+1;
				}
			}
		}
		return dp[m][n];
	}
	
	
	
	public static int editDistanceDp(String str1, String str2, int i, int j,int dp[][] ) {
		
		//Your code goes here
		if(str1.length()==i&& str2.length()!=j) {
			return str2.length()-j;
		}
		else if(str2.length()==j&& str1.length()!=i) {
			return str1.length()-i;
		}
		else if(str1.length()==i && str2.length()==j) {
			return 0;
		}
		int ans;
		
		if(str1.charAt(i)==str2.charAt(j)) {
			if(dp[i+1][j+1]==-1) {
			ans=editDistanceDp(str1, str2, i+1, j+1,dp);
			dp[i+1][j+1]=ans;
			}
			else {
				ans=dp[i+1][j+1];
			}	
		}
		else {
			int ans2,ans3,ans4;
			if(dp[i+1][j]==-1) {
			ans2=1+editDistanceDp(str1, str2, i+1,j,dp);
			dp[i+1][j]=ans2;
			}
			else {
				ans2=dp[i+1][j];
			}
			if(dp[i][j+1]==-1) {
			ans3=1+editDistanceDp(str1, str2, i,j+1,dp);
			dp[i][j+1]=ans3;
			}
			else {
				ans3=dp[i][j+1];
			}
			if(dp[i+1][j+1]==-1) {
			ans4=1+editDistanceDp(str1, str2, i+1, j+1,dp);
			dp[i+1][j+1]=ans4;
			}
			else {
				ans4=dp[i+1][j+1];
			}
			ans=Math.min(ans2, Math.min(ans4, ans3));
		}
		return ans;
		
		
	}
	
	public static int editDistanceR(String str1, String str2, int i, int j) {
		//Your code goes here
		if(str1.length()==i&& str2.length()!=j) {
			return str2.length()-j;
		}
		else if(str2.length()==j&& str1.length()!=i) {
			return str1.length()-i;
		}
		else if(str1.length()==i && str2.length()==j) {
			return 0;
		}
		int ans;
		
		if(str1.charAt(i)==str2.charAt(j)) {
			ans=editDistanceR(str1, str2, i+1, j+1);
		}
		else {
			int ans2,ans3,ans4;
			ans2=1+editDistanceR(str1, str2, i+1,j);
			ans3=1+editDistanceR(str1, str2, i,j+1);
			ans4=1+editDistanceR(str1, str2, i+1, j+1);
			ans=Math.min(ans2, Math.min(ans4, ans3));
		}
		return ans;
		
		
		
		
    }
	
	public static int editDistance(String s, String t) {
		//Your code goes here
		return editDistanceR(s,t,0,0);
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="wncpoddas";
		String str2="wqegesggfff";
//		int ans=editDistance(str1, str2);
		
		
		int dp[][]=new int [str1.length()+1][str2.length()+1];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				dp[i][j]=-1;
			}
		}
		int ans=editDistanceDp(str1, str2, 0, 0, dp);
		System.out.println(ans);
		
		int irt=editDistanceI(str1, str2);
		System.out.println(irt);
		

	}

}
