package functions;

import java.util.Scanner;

public class FahrenheitTocelsius {
	public static int f2C(int a)
	{
		
		double f=(5.0/9.0) ;
		int c=(int)(f*(a-32));
		return c;
				
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int S=s.nextInt();
		int E=s.nextInt();
		int W=s.nextInt();
		for(int i=S;i<=E;i=i+W) {
			System.out.println(i+" "+f2C(i));
		}

	}

}
