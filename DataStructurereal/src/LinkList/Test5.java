package LinkList;


class Student{
    String name;
    int rollNo;
    public Student(int n){
    rollNo = n;
       }   
    void print(){
    System.out.print(rollNo +" " + name+" ");
    }
}


class A{
	   A(){
	        System.out.print("first ");
	    }
	}
	class B extends A{
	    B(){
	        System.out.print("second ");
	    }
	}
	class C extends B{
	    C(){
	        System.out.print("third ");
	    }
	}

public class Test5 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student s = new Student(56);
//	    s.print();
		
		
		C c=new C();
	    }

	}


