package FullTest3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Integer[] arr = new Integer[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr, Collections.reverseOrder());
		
		
		for( int i:arr) {
			System.out.print(i+" ");
		}
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			if ((i + 1) % 3 == 0){
				sum -= arr[i];
			}
		}
		System.out.println(sum);
	}

}