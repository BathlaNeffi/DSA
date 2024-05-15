package Recursion;

public class isSorted {
	public static boolean sortedif(int arr[]) {
		if(arr.length==1) {return true;}
		if(arr[0]>arr[1]) {return false;}
		
		int [] small_arr=new int [arr.length -1];
		for(int i=1; i<arr.length; i++) {
			small_arr[i-1]=arr[i];
		}
		boolean issmall_sorted=sortedif(small_arr);
		return issmall_sorted;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]= {1,2,6,4,5};
		System.out.println(sortedif(n));
		

	}

}
