package classes;



	class Test 
	{ 
		int a; 
		int b; 

		public void set(int a, int b) 
		{  
			b = a; 
			this.b = b; 
		} 

		void display() 
		{ 
			System.out.println("a=" + a + " b=" + b); 
		} 
	}
	public class This {
		public static void main(String[] args) 
		{ 
			Test object = new Test();
			object.set(10,20);
			object.display(); 
		} 
	} 
	
	
	
//	When object.set function is called, the local variables are a and b which are passed on to the function as  parameters.
//
//	a=10,b=20.
//	But a has been assigned  to b. That means b comes 10.
//	Now this.b=b sets the variable b of class Test equal to 10 and a remains 0.
