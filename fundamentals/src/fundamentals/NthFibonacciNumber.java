package fundamentals;

import java.util.Scanner;

public class NthFibonacciNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int a=0;
		int b=1;
		int c;
		int k=1;
		for (;k<=n;)
		{
			c=a+b;
			a=b;
			b=c;
			k++;
			
			
		}
		System.out.println(a);
	}

}
