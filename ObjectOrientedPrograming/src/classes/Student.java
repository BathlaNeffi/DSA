package classes;

public class Student {
	String name;
	 int rollno;
	private static int numStudent;
	public final static double CONVERSIONRATEe=0.98;
	 
	
	public Student(String name) {
		this.name=name;
		
		numStudent++;
		rollno=numStudent;
	}
	
	public void print() {
		System.out.println(this.name + " "+ this.rollno);
	}
	
	public static int getnumStudent() {
		return numStudent;
	}
	
	
	

	
//	    public int getrollno() {
//	    	return rollno;
//	    }
//	    
//	    public void setrollno(int rollno) {
//	    	System.out.println(this);
//	    	this.rollno=rollno;
//	    }
}

