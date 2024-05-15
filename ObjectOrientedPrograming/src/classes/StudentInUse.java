package classes;

public class StudentInUse {

	public static void main(String[] args) {
		Student s1;
		s1=new Student("Neffi");
		Student s2=new Student("Pinky");
		Student s3=new Student("Panthy");
		System.out.println(s1.rollno);
		System.out.println(s2.rollno);
		System.out.println(s3.rollno);
	
		System.out.println(Student.getnumStudent());
		System.out.println(s1.getnumStudent());
		
		
	
//		s1.print();
		
		
		
		
		
////		Scanner s=new Scanner(source);
//		Student s1=new Student();
////		Student s2= new Student();
//		
////		System.out.println(s1);
//		
//		s1.setrollno(5);
//		s1.name="neffi";
////		s2.setrollno(6);
////		s2.name="rahul"; 
//		System.out.println(s1);
//		System.out.println(s1.name + " " +s1.getrollno());
////		System.out.println(s2.name + " " +s2.getrollno());
//		
		
		

	}

}
