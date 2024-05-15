package FullTest1;

import java.util.HashMap;

public class CheckSubset {
	
	
	public static boolean CheckSubset(int[] arr1, int n1, int[] arr2, int n2) {
		/*Your class should be named solution. 
		*Don't write main().
		*Don't take input, it is passed as function argument.
		*Don't print output.
		*Taking input and printing output is handled automatically.
		*
		*/
		
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<n1;i++) {
			if(map.containsKey(arr1[i])) {
				map.put(arr1[i],map.get(arr1[i])+1);
			}
			else {
				map.put(arr1[i], 1);
			}
		}
		
		for(int i=0;i<arr2.length;i++) {
			if(map.containsKey(arr2[i]) && map.get(arr2[i])!=0) {
				  int orginalvalue=map.get(arr2[i]);
				  map.put(arr2[i], orginalvalue-1);
			}
			else {
				return false;
			}
		}
		
		
		
        return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {3,6,5,8,15,1,14,18,7,9,14,9,3,12,8};
		int arr2[]= {18,6,9,8};
		
		System.out.println(CheckSubset(arr1, arr1.length, arr2, arr2.length));
	}

}
