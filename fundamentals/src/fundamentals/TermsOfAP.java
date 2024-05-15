package fundamentals;

import java.util.Scanner;

public class TermsOfAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int val=1;
		int k=1;
		for(int i=1;k<=N; i++) {
			val=3*i +2;
					if(val%4==0) {
						continue;
					}
			System.out.print(val+" ");
			k++;
		}

	}

}
