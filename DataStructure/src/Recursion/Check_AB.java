package Recursion;

import java.util.Scanner;

public class Check_AB {
	
//public static boolean quick(String s){
//		
//		if(s.length()==0)
//			return true;
//		boolean b=false;
//		if(s.charAt(0)=='a'){
//			if(s.length()==1){
//				return true;
//			}else if(s.charAt(1)=='a'){
//				b=quick(s.substring(1));
//			}else if(s.length()>=3 && s.substring(1, 3).equals("bb")){
//				b=quick(s.substring(2));
//			}else{
//				return false;
//			}
//		}else if(s.charAt(0)=='b'){
//			if(s.length()==1){
//				return true;
//			}else if(s.charAt(1)=='a'){
//				b=quick(s.substring(1));
//			}else{
//				return false;
//			}
//		}
//		
//		return b;
//	}

	
	
	public static boolean checkAB(String str) {
		if(str.length()==0) {return true;}
		
		if(str.charAt(0)=='a') {
		if(str.substring(1).length()>1 && str.substring(1,3).equals("bb")) {
			return checkAB(str.substring(3));}
		else {
			return checkAB(str.substring(1));
		}
		}
		return false;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println(checkAB(str));

	}

}
