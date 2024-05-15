package Recursion;

import java.util.Scanner;



public class SumOfNatural {
	public static int SUM(int n) {
		
		if(n==0) {return 0;}
		
		int hypohesis=SUM(n-1);
		int output=n+ hypohesis;
		return output;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(SUM(n));

	}

}
