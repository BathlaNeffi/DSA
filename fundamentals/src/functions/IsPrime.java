package functions;

public class IsPrime {
	 public static boolean isPrime(int x)
	 {
	     for(int i=2;i<x/2;i++)
	     {
	         if(x%i==0)
	         return false;
	     }
	     return true;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isPrime(50));

	}

}
