package fundamentals;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		/*Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		//		boolean isprime= true;
		int i=2;
		while(i<=n/2) {

			if(n%i==0){ 
				System.out.println("Composite");
				return;
				//				isprime=false;
			}

			i=i+1;
		}
		//		if(isprime) {
		//			System.out.println("Prime");}
		//			else {
		//				System.out.println("Composite");
		//			}
		System.out.println("Prime");
		*/
		
		int i=10;
	    while((i=i-1)>0)
	    {
	        System.out.print(i);
	        if(i%5==0)
	            return;
	    }
	}
}


