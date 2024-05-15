package FullTest1;

import java.util.Scanner;

public class BackSpace {
	
	
	public static String backspace(String s){
		
		for (int i = 0; i < s.length(); i++) {
		      if (s.charAt(i) == '#') {
		        s = s.substring(0, i - 1) + s.substring(i + 1);
		        i -= 2;
		      }
		    }
		    return s;
		  }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		String str=s.next();
		System.out.println(backspace(str));

	}

}
