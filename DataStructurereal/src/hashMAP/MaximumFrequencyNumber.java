package hashMAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class MaximumFrequencyNumber {

	public static int maxFrequencyNumber(int[] arr){ 
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		
		
		HashMap<Integer, Integer> map=new HashMap<>();
		
		for(int i=0; i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
			map.put(arr[i],map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
			
		}
		
		int max=0;
		int maxKey=Integer.MIN_VALUE;
		for(int i=0; i<arr.length;i++) {
			if(map.get(arr[i])>max) {
				max=map.get(arr[i]);
				maxKey=arr[i];
			}
		}
		return maxKey;
		
		
		
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,2,3,2,3,5,4,4,5,3,1,6,3};

		int max=maxFrequencyNumber(arr);
		System.out.println(max);

	}

}
