package fundamentals;
import java.util.Scanner;
public class TotalSalaryQuestion {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int basic=s.nextInt();
		String str=s.next();
		char grade=str.charAt(0);
		int allow;
		if (grade=='A') {allow=1700;}
		else if(grade=='B') {allow=1500;}
		else {allow=1300;}
		
		double totalSalary , hra, da , pf;
		hra=0.2*basic;
		da=0.5*basic;
		pf=0.11*basic;
		
		totalSalary=(hra + da +allow +basic) -pf;
		 System.out.println(String.format("%.0f", totalSalary));
		
		
				
				

	}

}
