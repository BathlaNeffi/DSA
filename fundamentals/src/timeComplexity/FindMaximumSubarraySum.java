package timeComplexity;

import java.util.Scanner;

public class FindMaximumSubarraySum {
		public static int maxSum(int arr[], int n, int k)
	    {
	        
	        if (n < k)
	        {
	           
	           return 0;
	        }
	      
	        
	        int res = 0;
	        for (int i=0; i<k; i++)
	           res += arr[i];
	      
	        int curr_sum = res;
	        for (int i=k; i<n-1; i++)
	        {
	        	curr_sum+=arr[i]-arr[i-k];
	           res = Math.max(res, curr_sum);
	        }
	      
	        return res;
	    }
		
		
	

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();

		int [] arr1=new int [n];
		for(int i=0;i<n;i++){
			arr1[i]=s.nextInt();
		}
		System.out.println(maxSum(arr1, n, k));
		

	}

}
