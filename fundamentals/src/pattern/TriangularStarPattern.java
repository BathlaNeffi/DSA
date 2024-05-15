package pattern;

import java.util.Scanner;

public class TriangularStarPattern {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int i=1;
		
		while(i<=num) {
			int j=1;
			while(j<=i) {
				System.out.print('*');
				j=j+1;
				
				
			}
			System.out.println();
			i=i+1;
		}

	}

}
