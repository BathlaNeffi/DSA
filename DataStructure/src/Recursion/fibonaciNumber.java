package Recursion;

import java.util.Scanner;

public class fibonaciNumber {
	public static void print(int n){
	    if(n < 0){
	        return;
	    }
	    if(n == 0){
	        System.out.print(n);
	        return;
	    }
	    print(--n);
	    System.out.print(n+" ");
	}
	
public static int fab(int n) {
	if(n==2 || n==1) {return 1;}
	int fib_n_1=fab(n-1);
	int fib_n_2=fab(n-2);
	int fib_n= fib_n_1 + fib_n_2;
	return fib_n;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		print(n);
		

	}

}
