package fundamentals;

import java.util.Scanner;

public class SumOrProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int C=s.nextInt();
		if(C==1) {
			int sum=0;
			for(int i=1; i<=N;i=i+1) {
				sum=sum+i;
			}
			System.out.println(sum);	
		}
		
		else if(C==2) {
			int prod=1;
			for(int i=1; i<=N;i=i+1) {
				prod=prod*i;
			}
			System.out.println(prod);
		}
		
		else {System.out.println("-1");}
	}

}
