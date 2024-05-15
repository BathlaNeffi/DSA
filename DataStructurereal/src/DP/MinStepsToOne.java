package DP;

import java.util.Scanner;

public class MinStepsToOne {



	public static int countMinStepsToOneDpI(int n) {
		if(n==1) {
			return 0;
		}
		int minCount[]=new int[n+1];
		
		for(int currStep=2;currStep<=n;currStep++) {
			int subtractOne=minCount[currStep-1];
			int devideByTwo=Integer.MAX_VALUE;
			int devideByThree=Integer.MAX_VALUE;
			if(currStep%2==0) {
				devideByTwo=minCount[currStep/2];
			}
			if(currStep%3==0) {
				devideByThree=minCount[currStep/3];
			}
			
			minCount[currStep]= 1+ Integer.min(subtractOne, Integer.min(devideByTwo, devideByThree));
			
		}
		
		return minCount[n];
	}









	public static int countMinStepsToOneDp(int n,int []dp) {
		if(n==1) {
			return 0;
		}
		int ans1;
		if(dp[n-1]==-1) {
			ans1=countMinStepsToOneDp(n-1,dp);
			dp[n-1]=ans1;
		}
		else {
			ans1=dp[n-1];
		}

		int ans2=Integer.MAX_VALUE;

		if(n%2==0) {
			if(dp[n/2]==-1) {
				ans2=countMinStepsToOneDp(n/2,dp);
				dp[n/2]=ans2;
			}

			else {
				ans2=dp[n/2];
			}
		}


		int ans3=Integer.MAX_VALUE;

		if(n%3==0) {
			if(dp[n/3]==-1) {
				ans3=countMinStepsToOneDp(n/3,dp);
				dp[n/3]=ans3;
			}

			else {
				ans3=dp[n/3];
			}
		}

		int myAns=Integer.min(ans1,Integer.min(ans2, ans3)) +1 ;
		return myAns;
	}



	//	public static int countMinStepsToOne(int n) {
	//		if(n==1) {
	//			return 0;
	//		}
	//		int ans1=countMinStepsToOne(n-1);
	//		int ans2=Integer.MAX_VALUE;
	//		
	//		if(n%2==0) {
	//			ans2=countMinStepsToOne(n/2);
	//		}
	//		int ans3=Integer.MAX_VALUE;
	//		if(n%3==0) {
	//			ans3=countMinStepsToOne(n/3);
	//		}
	//		
	//		int myAns=Integer.min(ans1,Integer.min(ans2, ans3)) +1;
	//		return myAns;
	//	}

	//	public static int countMinStepsToOne(int n, int result) {
	//		//Your code goes here
	//		if(n==1) {
	//			return result;
	//		}
	//		if(n==3) {
	//			return result+1;
	//			
	//		}
	//		if(n==2) {
	//			return result +1;
	//		}
	//		
	//		
	//		
	//		if(n%3==0) {
	//			result+=1;
	//			n/=3;
	////			System.out.println(n+" 3");
	//			
	//			return countMinStepsToOne(n,result);	
	//		}
	//		else {
	//			n-=1;
	////			System.out.println(-1);
	//			
	//			
	//			if(n%3==0) {
	//				result+=1;
	//				
	//				result+=1;
	//				n/=3;
	////				System.out.println(n+" 3");
	//				
	//				return countMinStepsToOne(n,result);
	//			}
	//			else {n+=1;}
	//			
	//		}
	//		 if(n%2==0) {
	//			result+=1;
	//			n/=2;
	////			System.out.println(n+" 2");
	//			return countMinStepsToOne(n,result);
	//			
	//		}
	//		
	//		result+=1;
	////		System.out.println(-1);
	//		 return countMinStepsToOne(n-1,result);
	//		 
	//		
	//		
	//		
	//		
	//	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

//		int dp[]=new int [n+1];
//		for(int i=0;i<=n;i++) {
//			dp[i]=-1;
//		}
//
//		System.out.println(countMinStepsToOneDp(n,dp));
		
		
		for(int i=1;i<20;i++) {
		
		System.out.println(countMinStepsToOneDpI(i));

		}



	}

}
