package fundamentals;

public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		  int a=10,b=20;
//		    int c=a&b;
//		    System.out.print(c);
//		    int d=a|b;
//		    System.out.print(d);
//		    int e=a^b;
//		    System.out.print(e);
//		    int f=c+d+e;
//		    System.out.print(~f);
//		 int a=10,b=-20;
//		    System.out.print(a^b);
//		 int a = 42;
//	       int b = ~a;// (there is tilde sign before a)
//	       System.out.print(a + " " + b);   
//		int x , y = 1;
//        x = 10;
//        if (x != 10 && x / 0 == 0)
//            System.out.println(y);
//        else
//            System.out.println(++y);
		
//		int g = 3;
//        System.out.print(++g * 8);
		
//		 int a=5;
//		a=(++a)+(a++);
//		    System.out.print(a);
		
		/*a+=++a-5/3+6*a.
		a+=11-1+6*11.
		a=10+11-1+66=86.*/
		 int a=10;                                           
		    a+=++a-5/3+6*a;
		    System.out.print(a);
		    
			
	}
	

}
