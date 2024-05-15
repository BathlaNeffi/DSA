package Recursion;

import java.util.Scanner;

public class NumberOfDigits {
	
	public static int number(int n) {
		if(n==0) { return 0;}
		
		
		int old_output=number(n/10);
		int output=old_output+1;
		
		return output;
				
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(number(n));
		

	}

}
