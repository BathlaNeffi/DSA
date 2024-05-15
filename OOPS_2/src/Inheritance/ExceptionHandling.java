package Inheritance;

public class ExceptionHandling {
	
	public static void chutiyapa(int n) {
		
	}
	
	public static int divide(int a, int b) throws DivideZeroException{
		if(b==0) {
//			throw new ArithmeticException();
			throw new DivideZeroException();
		}
		return a/b;
	}

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		try {
//			
//			// File f=new File();
//			System.out.println(divide(10, 2));
//			System.out.println("With in try");
//		} catch (DivideZeroException e) {
//			// TODO Auto-generated catch block
//			System.out.println("Divide by zero exception");
////			e.printStackTrace();
//		}
//		
//		catch (Exception e){
//			System.out.println("General");
//		}
//		finally {
//			System.out.println("Tera baap Fianlly");
//		}
//		
//		
//		
//		System.out.println("main");
		
		
		 try{
		       int a = 5/0;
		    }
		 catch(ArithmeticException e){
		        System.out.print("Arithmetic Exception caught ");
		   }
		    catch(Exception e){
		        System.out.print("Exception caught ");
		    }
		    
		   finally{
		       System.out.print("finally block");
		   } 

	}

}
