package pattern;

import java.util.Scanner;

public class TringularPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no. of rows:");
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		System.out.println("Enter no. of colums:");
		int column=s.nextInt();
		int i=1;
		int w=1;
		while(i<=row) {
			int j=1;
			while(j<=i) {
				System.out.print(w);
				j=j+1;
				w=w+1;
				
			}
			System.out.println();
			i=i+1;
		}

	}

}
