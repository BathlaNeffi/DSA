package DP;

public class CoinTower {
	
	public static String findWinner(int n, int x, int y) {
	// we can assume that x is smaller than y if not then swap them
		
		if(x>y) {
			int temp=x;
			x=y;y=temp;
		}
		boolean dp[]=new boolean [n+1];
		// i represent no. of coins left
		
		// dp is the arry of winning chance of the bureus
		for(int i=1;i<=n;i++) {
			//if 1,x,y coins are left then i will bures will pick those and will
			if(i==1||i==x||i==y) {
				dp[i]=true;
			}
			
			// when i<x that means only less then x coins left thn the this is true that the bureus and whill will remove one one coin
			
			else if(i<x) {
				dp[i]=!(dp[i-1]);
			}
			// now the intreseting casee when the i is between x and y and now the users can remove either 1 or x soo if the burese needs to
			// then he must move that way the other can fail soo if the winner chnace is in removing 1 and not in removing x then he must move x 
			// else vicevesa and if both way he is loosing then i guess there is no chnace for bures and whill can win
			//if both the ways bures can win then ofcouse he will have to again loose
			
			else if(i<y) {
				dp[i]=!(dp[i-x]&&dp[i-1]);
			}
			
			else {
				dp[i]=!(dp[i-x]&&dp[i-y]&&dp[i-1]);
			}
			
		}
		
		boolean result=dp[n];
		
		if(result) {
			return "Beerus";
		}
		else return "Whis";
		
		
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(findWinner(10,3,4));
		
		
		

	}

}
