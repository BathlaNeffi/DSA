package fundamentals;
import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		  int S= s.nextInt();
		  int E= s.nextInt();
		  int W=s.nextInt();
		 
		  int C;
		 
		  while(S<=E) {
			  C=(int)((S-32)/1.80);
			  System.out.println(S+" "+ C);
			  S=S+W;
		  
		  }
		  
		  

	}

}
