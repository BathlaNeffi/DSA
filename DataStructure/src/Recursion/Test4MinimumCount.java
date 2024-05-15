package Recursion;

import java.util.Scanner;

public class Test4MinimumCount {
	
	public static int minCount(int n) {
		{
	         
	        // base cases
	        if (n <= 3)
	            return n;
	 
	        // getMinSquares rest of the
	        // table using recursive
	        // formula
	        // Maximum squares required is
	        int result = n;
	        // n (1*1 + 1*1 + ..)
	 
	        // Go through all smaller numbers
	        // to recursively find minimum
	        for (int x = 1; x <= n; x++)
	        {
	            int temp = x * x;
	            if (temp > n)
	                break;
	            else
	                result = Math.min(result, 1 +
	                		minCount(n - temp));
	        }
	        return result;
		}
	
		
		
		
	}
	
	
//	public static boolean checkprime(int n) {
//		
//	    boolean isprime=true;
//	    if(n%2==0)
//	        isprime=false;
//	    int i=3;
//	    while(isprime&&i<n)
//	    {
//	        isprime=!(n%i==0);
//	        i+=2;
//	    }
//	    return isprime;
//
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(minCount(n));
		
		
	

	}

}
