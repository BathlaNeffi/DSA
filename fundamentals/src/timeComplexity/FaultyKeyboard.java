package timeComplexity;

import java.util.Scanner;

public class FaultyKeyboard {
	
	public static boolean faulty(String str1, String str2) {
		if(str1.length() > str2.length()) return false;
		
		
		int n=str1.length();
		int k=str2.length();
		int i=0,j=0;
		while( i<k && j<n) {
			
			if(str2.charAt(i)==str1.charAt(j)){i++;j++;}
			else if(j>0 && str1.charAt(j-1)==str2.charAt(i)) {i++;}
			else {  return false;}
				
		}
		
		while(i<str2.length()) {
			if(str2.charAt(i)!= str1.charAt(j-1)){return false;}
			i++;
		}
		
		if(j < str1.length()) {return false;}
		else {return true;}
		
		
		
		
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=0;i<n;i++){
            String name = scn.next();
        String typed = scn.next();

        boolean res = faulty(name, typed);

        System.out.println(res);
        }
		
		

	}

}
