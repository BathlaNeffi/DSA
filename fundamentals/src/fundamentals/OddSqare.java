package fundamentals;

import java.util.Scanner;

public class OddSqare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int k=1;
		while(i<=n) {
			int j=1;
			int a=k;
			

			while(j<=n-i+1) {
				System.out.print(a);
				j=j+1;
				a=a+2;
				
			}
				int b =1;
			int inc=1;
			while(inc<=i-1) {System.out.print(b);b=b+2;inc=inc+1;}
			System.out.println();
			i=i+1;
			k=k+2;
		}

	}

}
