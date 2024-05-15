package hashMAP;

import java.util.HashMap;

public class PairWithDifferenceK {
	
	
	public static int getPairsWithDifferenceK(int arr[], int k) {
		//Write your code here
		int count=0;
		
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i=0; i<arr.length;i++) 
		{
			if(map.containsKey(arr[i])) {
				int val=map.get(arr[i]);
				map.put(arr[i], val+1);
			}
			else {
				map.put(arr[i],1);
			}
				
		}
		
		for(int i=0; i<arr.length;i++) {
			int key=arr[i];
			if(map.containsKey(key)) {
			int value=map.get(key);
			
			if(k!=0) {
			int fd1=key-k;
				
			if(map.containsKey(fd1)) {
				count+= value*map.get(fd1);
			}
			int fd2=k+key;
			if(map.containsKey(fd2)) {
				count+= value*map.get(fd2);
			}
			}
			else if(value>1) {
				
			 count+= sumOfNaturalNum(value-1);
			}
			
			map.put(key, 0);
			}
		
					
			
			
		}
		
		return count;
		
		
	}

	private static int sumOfNaturalNum(int n) {
		// TODO Auto-generated method stub
		
		if(n==1) {
			return 1;
		}
		if(n<=0) {
			return 0;
		}
		
		int sum=sumOfNaturalNum(n-1) +n; 
		
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]= {4,3,2,1,2,2,4};
		System.out.println(getPairsWithDifferenceK(arr, 0));
//		System.out.println(sumOfNaturalNum(3));

	}

}
