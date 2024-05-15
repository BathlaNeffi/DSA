package timeComplexity;

import java.util.Scanner;

public class FindUniqueElementXOR {
	
	public static int findUnique(int[] arr) {
		int uniq=arr[0];
		for(int i=1;i<arr.length ;i++) {
			uniq^=arr[i];
		}
		return uniq;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

		int [] arr1=new int [n];
		for(int i=0;i<n;i++){
			arr1[i]=s.nextInt();
		}
		System.out.println(findUnique(arr1));

	}

}
