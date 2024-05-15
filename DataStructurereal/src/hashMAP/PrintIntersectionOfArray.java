package hashMAP;

import java.util.Arrays;
import java.util.HashMap;

public class PrintIntersectionOfArray {


	public static void intersection(int[] arr1, int[] arr2) {
		//Your code goes here
		
		
		if(arr1.length==0 || arr2.length==0)
			return ;

		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr1.length;i++) {
			if(map.containsKey(arr1[i])) 
				map.put(arr1[i], map.get(arr1[i])+1);

			else
				map.put(arr1[i],1);

		}

		for(int i=0;i<arr2.length;i++)
		{
			if(map.containsKey(arr2[i]) && map.get(arr2[i])>0) {

					System.out.print(arr2[i]+" ");
					map.put(arr2[i],map.get(arr2[i])-1);
				}
			}
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[]= {2,1,2,2};
		int arr2[]= {2,2,2,2};
		intersection(arr1, arr2);

	}

}
