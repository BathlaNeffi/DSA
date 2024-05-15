package fundamentals;

import java.util.Scanner;

public class codingtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=0;
			while(j<=n-i-1) {
				System.out.print(n-j);
				j=j+1;
			}
			System.out.print('*');
			int q=i-1; 
			while(q>=1) {
				System.out.print(q);
				q=q-1;
			}
			i=i+1;
			System.out.println();
		}
	}
}
			

