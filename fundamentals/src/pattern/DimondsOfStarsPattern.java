package pattern;

import java.util.Scanner;

public class DimondsOfStarsPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int g=(n/2)+1;
		while(i<=g) {
			int j=1;
			while(j<=g-i){System.out.print(' '); j=j+1;}
			int k=1;
			while(k<=i) {System.out.print('*');k=k+1;}
			int dec=i-1;
			while(dec>=1) {System.out.print('*');dec=dec-1;}
			System.out.println();
			i=i+1;

		}
		int a=g+1;
		while(a<=n) {
			int j=1;
			while(j<=a-g){System.out.print(' '); j=j+1;}
			int k=1;
			while(k<=n-a) {System.out.print('*');k=k+1;}
			int dec=n-a;
			while(dec>=0) {System.out.print('*');dec=dec-1;}
			System.out.println();
			a=a+1;

		}
	}

}
