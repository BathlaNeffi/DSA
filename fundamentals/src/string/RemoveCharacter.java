package string;

import java.util.Scanner;

public class RemoveCharacter {
	
	public static String removeChar(String str,char ch) {
		String sol="";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)!=ch) {
				sol+=str.charAt(i);
			}
			else continue;
				
			
		}
		return sol;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String str2=s.next();
		char ch=str2.charAt(0);
		String sol=removeChar(str, ch);
		System.out.println(sol);
		
		
		
		

	}

}
