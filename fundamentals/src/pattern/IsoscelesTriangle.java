package pattern;

import java.util.Scanner;

public class IsoscelesTriangle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n){
			int space=1;
			while(space<=n-i) {
				System.out.print(' ');
				space=space+1;
			}
			int j=1;
			while(j<=i) {
				System.out.print(j);
				j=j+1;
			}
			int q=i-1;
			while(q>=1) {
				System.out.print(q);
				q=q-1;
			}
			
//			int p=1;
//			while(p+1<=i) {
//				System.out.print(p);
//				p=p+1;
//			}
//			int k=1;
//			while(k<=n-i) {
//				System.out.print(' ');
//				k=k+1;
//			}
			
			
			System.out.println();
			i=i+1;
		}
	}

}
