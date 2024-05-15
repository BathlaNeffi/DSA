package pattern;

import java.util.Scanner;

public class HalfDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println('*');
		int i=2;
		int G=(2*n) +1;
		int g=(G/2) +1;
		while(i<=g) {
			System.out.print('*');
			int j=1;
			while(j<=i-1){System.out.print(j); j=j+1;}

			int dec=i-2;
			while(dec>=1) {System.out.print(dec);dec=dec-1;}
			if(i>=2) {System.out.print('*');}
			System.out.println();
			i=i+1;

		}
		 i=g+1;
		while(i<=G) {
			System.out.print('*');
			int dec=G-1;
			int a=1;
			while(dec>=i) {System.out.print(a);a=a+1; dec=dec-1;}
			
			int dec2=G-2;
			int b=a-2;
			while(dec2>=i) {System.out.print(b); b=b-1;dec2=dec2-1;}
			if(i<=G-1) {System.out.print('*');}
			System.out.println();
			
				
			i=i+1;
		}
		if (n==0) {
		System.out.println('*');}
	}
}

