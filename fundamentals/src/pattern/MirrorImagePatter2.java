package pattern;

import java.util.Scanner;

public class MirrorImagePatter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int i=1;
		while(i<=num) {
			int space=1;

			while(space<=num-i) {

				System.out.print(' ');
				space=space+1;
			}
			int stars=1;
			while(stars<=i) {

				System.out.print(stars);
				stars=stars+1;
			}
			System.out.println();
			i=i+1;	
		}



	}

}
