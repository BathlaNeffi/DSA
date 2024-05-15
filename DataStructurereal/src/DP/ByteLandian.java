package DP;

import java.util.HashMap;
import java.util.Scanner;

public class ByteLandian {
	
	
	public static int bytelandian(int n) {
		
		if(n<=1) {
			return n;
		}
		
		int value=bytelandian(n/2)+bytelandian(n/3)+bytelandian(n/4);
		
		return Math.max(n, value);
		
	}
	
	
	public static long bytelandian(long n, HashMap<Long, Long> memo) {
        // Write your code here
		
		if(n<=1) {
			return n;
		}
		
		if(memo.get(n)!=null) {
			return memo.get(n);
		}
		
		long breakDownValue=bytelandian(n/2, memo) + bytelandian(n/3, memo) + bytelandian(n/4, memo);
		
		memo.put(n, Math.max(n, breakDownValue));
		
		return memo.get(n);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<Long,Long> test=new HashMap<>();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		

		
		System.out.println(bytelandian(n,test));
		
		System.out.println(bytelandian(n));
	}

}
