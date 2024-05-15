package Recursion;
import java.util.Scanner;
public class RemoveDuplicatesRecursively {
	
	public static String removeConsecutiveDuplicates(String s) {
		if(s.length()<=1) {return s;}
		
		if(s.charAt(0)==s.charAt(1)) {
			// for n-2
			return removeConsecutiveDuplicates(s.substring(1));
		}
		else {
			//n-1
			String smallString=removeConsecutiveDuplicates(s.substring(1));
			return s.charAt(0) + smallString;
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println(removeConsecutiveDuplicates(str));

	}

}
