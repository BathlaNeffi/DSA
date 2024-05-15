package pattern;

import java.util.Scanner;
public class SumPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int i=1;
		while(i<=N) {
			int j=1;
			int sum=0;
			while(j<=i) {System.out.print(j);sum=sum+j; j=j+1; 
			if(j<=i) {System.out.print("+");}
			}

			System.out.print("="+sum);
			System.out.println();
			i=i+1;
		}


	}

}
