package functions;
import java.util.Scanner;

public class DivideNumber {
	public static int divide(int a,int b) {
		if(b==0) {
			return Integer.MIN_VALUE;
		}
		return a/b;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(divide(a,b));

	}

}
