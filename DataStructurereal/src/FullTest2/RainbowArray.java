package FullTest2;

import java.util.HashMap;

public class RainbowArray {
	
	
	public static void israinbow(int [] arr){
        // Write your code here
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=1;i<=7;i++) {
			map.put(i, 0);
		}
		boolean rainbow=true;
		boolean mid=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>7) {
				rainbow=false;
				break;
			}
			if(arr[i]==7) {
			
				mid=true;
			}
			
			if(mid) {
				map.put(arr[i], map.get(arr[i])-1);
			}
			else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		for(int i=1;i<7;i++) {
			if(map.get(i)!=0) {
				rainbow=false;
			}
		}
		
		if(rainbow) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,4,5,6,6,6,7,6,6,6,5,4,4,3,2,1};
		
		israinbow(arr);

	}

}
