package FullTest3;

import java.util.Scanner;

public class GameOfNumbers {
	
	
	
	public static int solve(int n1,int n2) {
		int ans=0;
		while(n2>n1) {
			ans++;
			if(n2%2==1) {
				n2++;
			}
			else {
				n2/=2;
			}
		}
		

		ans+=n1-n2;
		return ans;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);

		int n1=s.nextInt();
		int n2=s.nextInt();
		
		System.out.println(solve(n1, n2));
//		if(n1>=n2) {
//			int n=n1-n2;
//			System.out.println(n);
//			return;
//		}
//		int k=0;
//	
//		while(n1<=n2) {
//			n1*=2;
//			k++;
//		}
//		if(n1==n2) {
//			System.out.print(k);
//			
//		}
//		else {
//			
//			System.out.println(k+1);
//		}

	}

}
