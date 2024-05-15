package Recursion;

import java.util.Scanner;

public class PairStar {
	
	public static String checkstar(String s, int si, int ei) {
		String temp="";
		 {
			for(int i=si;i<s.length();i++) {
				
				if(i==si+1) { temp+='*';}
				temp+=s.charAt(i);
				
			}
		}
		return temp;
	}
	
	public static String addStars(String s) {
		if(s.length()==1) {return s;}
		
		if(s.charAt(0)==s.charAt(1)) {
			s=checkstar(s, 0, 1);
		}
		String str="";
		str=s.charAt(0)+addStars(s.substring(1));
		return str;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println(addStars(str));

		
	}

}
