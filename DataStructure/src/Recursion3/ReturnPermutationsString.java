package Recursion3;

public class ReturnPermutationsString {
	
	
//	public static String[] permutationOfString(String input){
//		if(input.length()==0) {
//			String[] y={""};
//			return y;
//		}	
//		
//		String [] output=new String[0];
//		int k=0;
//		
//		for(int j=0; j<input.length();j++) {
//		String[] smallOutput=permutationOfString(input.substring(0,j)+input.substring(j+1));
//		int curr=j;
//		String[] temp=new String[smallOutput.length*input.length()];		
//		for(int i=0; i<smallOutput.length;i++) {
//			temp[k++]=input.charAt(curr)+smallOutput[i];
//		}
//		
//		
//		output=temp;
//		
//		}
//		return output;
//		
//	}
	
	
	public static void permutationOfString(String input, String output){
		if(input.length()==0) {
			System.out.println(output);
			return;
		}
		
		for( int i=0; i<input.length();i++) {
			
			permutationOfString(input.substring(0,i)+input.substring(i+1),output+input.charAt(i));
		}
	}
	
	
	
	public static String[] permutationOfString(String input){
		// Write your code here
	
        if(input.length() == 0){
            String y[] = {""};
            return y;
        }
        
        String [] ans = permutationOfString(input.substring(1));
    
		String output[] = new String[ans.length*input.length()];
        
        int k=0;	
     for(int i=0; i<ans.length;i++) {
    	 for( int j=0; j<=ans[i].length();j++) {
    		 output[k++]=ans[i].substring(0, j)+ input.charAt(0)+ans[i].substring(j);
    	 }
     }
        
        return output;
	}
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st="abc";
		
		permutationOfString(st,"");
		
//		String [] print=permutationOfString(st);
//		
//		for(String i: print) {
//			System.out.println(i);
//		}
//		
//		String test=st.substring(0,0);
//		System.out.println(test);
//		
		

	}

}
