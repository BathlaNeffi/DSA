package Recursion;

import java.util.Scanner;

public class print1ton {
	public static void oneton(int n) {
		if(n<=0) {return;}
		oneton(n-1);
		System.out.print(n+" ");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		oneton(n);

	}

}
