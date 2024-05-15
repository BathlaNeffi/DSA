package classes;

public class MCQ {
public static void main(String[] args) 
{ 
    Test1.fun1(); 
} 
} 

class Test1 
{
    static int a = 10; 
    static int b = 20; 
    static void fun1() 
    { 
        a = 20;                             //Line 1
        b = 10;                             //Line 2
        fun2();                             //Line 3
        System.out.print(b);           //Line 4
    } 
    static void fun2() 
    {     
        System.out.println("from m2"); 
    }
}




//	public static void main (String[] args) {
//        Tesst1 t=new Tesst1();              
//        t.set_marks(78);
//        System.out.println(t.marks);//Line 2
//        System.out.print(Tesst1.marks);   //Line 3
////        System.out.println("r");
//        
//    }
//
//}

//class Tesst1 {
//	static int marks;
//    void set_marks(int marks)
//    {
//        this.marks=marks;               //Line 1
//    }
//    
//}