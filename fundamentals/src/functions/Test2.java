package functions;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

		int i=1;
		while(i<=n) {
		 int j=1;
		 while(j<=n-i +1) {
			 System.out.print(j);
			 j++;
			 
		 }
		 int k=1;
		 while(k<=i-1) {
			 System.out.print('*');
			 k=k+1;
		 }
		 int h=1;
		 while(h<=i-1) {
			 System.out.print('*');
			 h++;
		 }
		 int a=1;
		 int dec=n-i+1;
		 while(a<=n-i+1) {
			 System.out.print(dec);
			 a++;
			 dec--;
		 }
		 System.out.println();
		 i++;

		}

	}

}
