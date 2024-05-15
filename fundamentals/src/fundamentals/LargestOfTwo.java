package fundamentals;

import java.util.Scanner;

public class LargestOfTwo {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		//		int a,b;
		//		
		//		 a=s.nextInt();
		//		 b= a%2;
		//		 
		//		 if(b==0) {
		//			 System.out.println("This is even");
		//		 }
		//		 else
		//		 {
		//			 System.out.println("This is odd");
		//		 }

		//		int a=10,b=15;
		//	    if(a>b)
		//	    {
		//	        System.out.print("a ");
		//	    }
		//	    else
		//	    {
		//	        System.out.print("b ");
		//	    }
		//	    System.out.print("is greater");

		//		int a=50;
		//		if(a>10)
		//		{
		//		    System.out.print("Coding");
		//		}
		//		else
		//		{
		//		    System.out.print("Ninjas");
		//		}			
		//		
		int a= s.nextInt();
		int b= s.nextInt();

		if (a>b) {
			System.out.println("a is greater than b");
		}
		else
		{
			if(a<b) {
				System.out.println("b is greater than a");
			}
			else
			{System.out.println("Both are equal");
			}

		}
	}

	//		 int x = 15;
	//		    if(x <= 15){
	//		        System.out.print("Inside if  ");
	//		    }else if(x == 15){
	//		        System.out.print("Inside else if  ");
	//		    }
	//		    System.out.println(x);

	//		int var1 = 5; 
	//        int var2 = 6;
	//        if ((var2 = 1) == var1) {
	//            System.out.print(var2);
	//        }
	//        else { 
	//            System.out.print(var2 + 1 +"This is else");
	//        }

	//		int a=50;
	//	    int b=5;
	//	    if(a/0==b)
	//	    {
	//
	//	        System.out.println("Hello");
	//	    }
	//	    else
	//	    {
	//	        System.out.println("Hi");
	//	    }


}

