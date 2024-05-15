package Recursion;

import java.util.Scanner;

public class MultiplicationUsingRecrusion {
	
	public static int multiplyTwoIntegers(int m, int n){
		if(n==0 || m==0) {return 0;}
		
		
		return multiplyTwoIntegers(m, n-1) +m;
		
	}
	
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		
		System.out.println(multiplyTwoIntegers(num1, num2));
		
		
	}

}
