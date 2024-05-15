package Recursion;

import java.util.Scanner;

public class SumOfDigits {
	
	public static int sumOfDigits(int input) {
		if(input%10==input) {return input;}
		int nextint=input/10;
		
		int value=sumOfDigits(nextint)+ input%10;
		
		return value;
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		System.out.println(sumOfDigits(num));
		

	}

}
