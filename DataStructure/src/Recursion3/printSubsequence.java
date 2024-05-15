package Recursion3;

public class printSubsequence {
	
	public static void printsubseuence(String str, String soFar) {
		if(str.length()==0) {
			System.out.println(soFar);
			return;
		}
		
	String small=str.substring(1);
		printsubseuence(small,soFar);
		printsubseuence(small,""+soFar+str.charAt(0));
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="abc";
		printsubseuence(str,"");

	}

}
