package Recursion3;

public class findMin {
	
	
	public static void findMin2(int [] arr, int startIndex, int answer) {
		
		if(startIndex==arr.length) {
			System.out.println(answer);
			return;
		}
		if(answer<arr[startIndex]) {
			findMin2(arr,startIndex+1,answer);
		}
		else {
			findMin2(arr,startIndex+1,arr[startIndex]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,3,4,5,6};
		findMin2(arr,0,Integer.MAX_VALUE);

	}

}
