package hashMAP;

import java.util.HashMap;

public class LongestSubarrayZeroSum {
	public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		// Write your code here
		HashMap<Integer,Integer> map=new HashMap<>();
		int sum=0;
		int maxLength=0;
		for(int i=0;i<arr.length;i++) {
			
			
			sum+=arr[i];
			if(map.containsKey(sum)) {
				int currLength=i-map.get(sum);
				if(maxLength<currLength) {
					maxLength=currLength;
				}
				
				
			}
			else {
				map.put(sum, i);
			}
			
			if(sum==0) {
				int currLength=i+1;
				
				if(maxLength<currLength) {
					maxLength=currLength;
				}
					
			}
			
		}
		
		
		
		return maxLength;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr[]= {6,3,-1,2,-4,3,1,-2,20};
		int arr[]= {2,-2,-2,2};
		
		
//		int arr[]= {95,-97,-387,-435,-5,-70,897,127,23,284};
		System.out.println(lengthOfLongestSubsetWithZeroSum(arr));

	}

}
